package trash;

import java.util.Scanner;

public class find_Ceiling_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int target = in.nextInt();
        int[] arr = { 2, 3, 5, 9, 14, 16, 18 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= target) {
                System.out.println("ceil number is: " + arr[i]);
                break;
            }

        }

    }
}
