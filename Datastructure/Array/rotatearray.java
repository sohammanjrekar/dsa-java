package Array;

public class rotatearray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int n = arr.length;
        int k = 3; // No. of rotations
        int i, j;
        System.out.println("Given array is ");
        for (i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

        // Reverse the first n-1 terms
        for (i = 0, j = n - k - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        // Reverse the entire array
        for (i = 0, j = n - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        System.out.println("\nRotated array is");
        for (i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}