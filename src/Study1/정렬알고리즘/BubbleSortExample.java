package Study1.정렬알고리즘;

import java.util.Arrays;

public class BubbleSortExample {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) { // 전체 배열 반복
            for (int j = 0; j < n - i - 1; j++) { // 점점 줄어드는 범위
                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};

        System.out.println("Before Sorting: " + Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("After Sorting: " + Arrays.toString(arr));
    }
}
