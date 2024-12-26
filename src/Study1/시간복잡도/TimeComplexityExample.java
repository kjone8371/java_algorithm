package Study1.시간복잡도;

public class TimeComplexityExample {
    public static void linearTime(int n) { // O(n)
        for (int i = 0; i < n; i++) {
            System.out.print(i + " "); // n번 실행
        }
        System.out.println();
    }

    public static void quadraticTime(int n) { // O(n^2)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("(" + i + "," + j + ") "); // n^2번 실행
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 5; // 입력 크기

        System.out.println("Linear Time O(n):");
        linearTime(n); // O(n)

        System.out.println("Quadratic Time O(n^2):");
        quadraticTime(n); // O(n^2)
    }
}

