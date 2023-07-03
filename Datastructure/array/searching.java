package Array;

import java.util.Arrays;
import java.util.Scanner;

public class searching {
    public static void main(String[] args) {
        int arr[] = new int[5];
        arr[0] = 45;
        arr[1] = 82;
        arr[2] = 76;
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        sc.close();
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                System.out.println("Location of target : " + i);
            }

        }

    }
}
