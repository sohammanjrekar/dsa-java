package recursion;

import java.util.Scanner;

public class recursion_binary_search {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int target = in.nextInt();
        int[] arr = { 2, 3, 5, 9, 14, 16, 18 };
        int start = 0;
        int end = arr.length - 1;
        int ans = binarysearch(arr, target, start, end);
        System.out.println("Index of target: " + ans);
        in.close();
    }

    static int binarysearch(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (arr[mid] > target) {
            binarysearch(arr, target, start, mid - 1);
        }
        return binarysearch(arr, target, mid + 1, end);
    }
}
