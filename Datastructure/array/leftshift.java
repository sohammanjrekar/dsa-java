package array;

import java.util.Arrays;
import java.util.Scanner;

public class leftshift {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        sc.close();
        int n = arr.length;
        for (int i = 0; i < d; i++) {
            int temp = arr[0];
            for (int j = 0; j < n - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[n - 1] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
