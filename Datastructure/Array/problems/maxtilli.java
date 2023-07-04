package Array.problems;

import java.util.Arrays;

//  Problem:given an array a[] of sizrn .for every i to n-1 output max till i.
public class maxtilli {
    public static void main(String[] args) {
        int[] arr = { 1, 0, 5, 4, 6, 8 };
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.max(max, arr[i]);
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
