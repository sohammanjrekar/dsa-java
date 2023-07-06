package Algorithms.DivideAndConqure;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;// output -> 4
        System.out.println(search(arr, target, 0, arr.length - 1));
    }

    private static int search(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (arr[mid] == target) {
            return mid;
        }
        if (arr[start] <= arr[mid]) {
            // case a:left
            if (arr[start] <= target && target <= arr[mid]) {
                return search(arr, target, start, mid);
            } else {
                // case b:right
                return search(arr, target, mid + 1, end);
            }
        } else {
            // case c:right
            if (arr[mid] <= target && target <= arr[end]) {
                return search(arr, target, mid + 1, end);
            } else {
                // case d:left
                return search(arr, target, start, mid - 1);
            }
        }
    }
}
