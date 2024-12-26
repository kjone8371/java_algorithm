package Study1.공간복잡도;

public class SpaceComplexityExample {
    // O(1): 추가 메모리를 사용하지 않음
    public static int sumArray(int[] arr) {
        int sum = 0; // 상수 공간
        for (int num : arr) {
            sum += num; // 입력 배열에 추가 메모리 사용 없음
        }
        return sum;
    }

    // O(n): 새로운 배열 생성
    public static int[] doubleArray(int[] arr) {
        int[] doubled = new int[arr.length]; // 배열 크기만큼 추가 공간 사용
        for (int i = 0; i < arr.length; i++) {
            doubled[i] = arr[i] * 2;
        }
        return doubled;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("O(1) Space:");
        int sum = sumArray(arr); // O(1)
        System.out.println("Sum: " + sum);

        System.out.println("O(n) Space:");
        int[] doubled = doubleArray(arr); // O(n)
        for (int num : doubled) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

