
// https://www.geeksforgeeks.org/write-a-program-to-reverse-an-array-or-string/

import java.util.Arrays;

public class reverse_array {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        int[] ans = reverse(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[] reverse(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            if (i >= arr.length - 1) {
                temp = arr[i];
                arr[i] = arr[arr.length - 1 - i];
                arr[arr.length - 1 - i] = temp;
            }
        }
        return arr;
    }
}
