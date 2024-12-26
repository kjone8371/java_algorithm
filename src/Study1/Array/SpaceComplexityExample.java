package Study1.Array;

public class SpaceComplexityExample {
    public static void main(String[] args) {
        int[] original = {1, 2, 3};
        int[] copy = new int[original.length];

        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i];
        }

        System.out.println("원본 배열: ");
        for (int num : original) System.out.print(num + " ");

        System.out.println("\n복사된 배열: ");
        for (int num : copy) System.out.print(num + " ");
    }
}

