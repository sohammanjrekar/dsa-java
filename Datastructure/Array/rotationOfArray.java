package Array;

import java.util.Arrays;

public class rotationOfArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };

        int temp = arr[4];
        for (int i = arr.length - 1; i > 0; i--) {

            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
        System.out.println(Arrays.toString(arr));
    }
}
// Time Complexity: O(n), as we need to iterate through all the elements. Where
// n is the number of elements in the array.
// Auxiliary Space: O(1), as we are using constant space.
