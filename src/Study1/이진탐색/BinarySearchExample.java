package Study1.이진탐색;

import java.util.Arrays;

public class BinarySearchExample {
    public static int binarySearch(int[] arr, int target) {
        int left = 0;  // 시작 인덱스
        int right = arr.length - 1;  // 끝 인덱스

        while (left <= right) {
            int mid = left + (right - left) / 2; // 중간값 계산 (오버플로 방지)

            if (arr[mid] == target) {
                return mid; // 값을 찾으면 인덱스 반환
            } else if (arr[mid] < target) {
                left = mid + 1; // 오른쪽 절반 탐색
            } else {
                right = mid - 1; // 왼쪽 절반 탐색
            }
        }

        return -1; // 값을 찾지 못한 경우
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 7, 11, 13, 17, 19}; // 정렬된 배열
        int target = 11;

        System.out.println("Array: " + Arrays.toString(arr));
        int result = binarySearch(arr, target);

        if (result != -1) {
            System.out.println("Target " + target + " found at index: " + result);
        } else {
            System.out.println("Target " + target + " not found in array.");
        }
    }
}

