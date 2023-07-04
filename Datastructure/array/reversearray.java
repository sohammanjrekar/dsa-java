package Array;

import java.util.Arrays;

public class reversearray {
    public static void main(String[] args) {
        int arr[] = new int[5];
        arr[0] = 45;
        arr[1] = 82;
        arr[2] = 76;
        System.out.println("Before: " + Arrays.toString(arr));
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
        System.out.println("After: " + Arrays.toString(arr));
    }
}
// Time Complexity: O(n)
// Auxiliary Space: O(1)
