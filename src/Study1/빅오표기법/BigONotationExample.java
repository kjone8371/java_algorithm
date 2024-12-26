package Study1.빅오표기법;

public class BigONotationExample {
    // O(1): 상수 시간
    public static void constantTime(int[] arr) {
        System.out.println("First element: " + arr[0]); // 항상 1번 실행
    }

    // O(n): 선형 시간
    public static void linearTime(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " "); // 배열의 크기만큼 실행
        }
        System.out.println();
    }

    // O(n^2): 이중 루프
    public static void quadraticTime(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print("(" + arr[i] + "," + arr[j] + ") "); // 배열 크기^2 만큼 실행
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("O(1):");
        constantTime(arr); // O(1)

        System.out.println("O(n):");
        linearTime(arr); // O(n)

        System.out.println("O(n^2):");
        quadraticTime(arr); // O(n^2)
    }
}

