package Study1.정렬알고리즘;

import java.util.Arrays;

public class QuickSortExample {
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);

            quickSort(arr, low, pivotIndex - 1); // 피벗 왼쪽 정렬
            quickSort(arr, pivotIndex + 1, high); // 피벗 오른쪽 정렬
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // 피벗은 마지막 요소
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // Swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap pivot into correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};

        System.out.println("Before Sorting: " + Arrays.toString(arr));
        quickSort(arr, 0, arr.length - 1);
        System.out.println("After Sorting: " + Arrays.toString(arr));
    }
}
