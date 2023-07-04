package Java.hashset;

import java.util.HashSet;

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
public class pairWithSum {
    public static void main(String[] args) {
        HashSet<Integer> list = new HashSet<>();
        int sum = -2;
        int[] arr = { 0, -1, 2, -3, 1 };
        for (int i = 0; i < arr.length; i++) {
            int tempnum = arr[i] - sum;
            if (list.contains(tempnum)) {
                System.out.println("true " + arr[i] + " " + tempnum);
                return;
            }
            list.add(arr[i]);
        }
        System.out.println("false");
    }
}
// Time Complexity: O(N), As the whole array is needed to be traversed only once.
// Auxiliary Space: O(N), A hash map has been used to store array elements.