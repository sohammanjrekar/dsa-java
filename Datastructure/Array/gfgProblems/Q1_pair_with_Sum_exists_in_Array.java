package Array.gfgProblems;

import java.util.Arrays;

/*
 Check if pair with given Sum exists in Array

Given an array A[] of n numbers and another number x, the task is to check whether or not there exist two elements in A[] whose sum is exactly x. 
Examples: 

Input: arr[] = {0, -1, 2, -3, 1}, x= -2
Output: Yes
Explanation:  If we calculate the sum of the output,1 + (-3) = -2

Input: arr[] = {1, -2, 1, 0, 5}, x = 0
Output: No
*/
public class Q1_pair_with_Sum_exists_in_Array {
    public static void main(String[] args) {
        int sum = -2;
        int[] arr = { 0, -1, 2, -3, 1 };
        Arrays.sort(arr);
        System.out.println(hasArrayTwoCandidates(arr, arr.length, sum));
        System.out.println(Arrays.toString(arr));
    }

    static boolean hasArrayTwoCandidates(int A[], int arr_size, int sum) {
        int l, r;
        Arrays.sort(A);
        l = 0;
        r = arr_size - 1;
        while (l < r) {
            if (A[l] + A[r] == sum)
                return true;
            else if (A[l] + A[r] < sum)
                l++;
            else // A[i] + A[j] > sum
                r--;
        }
        return false;
    }
}

// Time Complexity: O(NlogN), Time complexity for sorting the array
// Auxiliary Space: O(1)