
import java.util.Arrays;
import java.util.Scanner;

public class search_in_twoDarray {
    public static void main(String[] args) {

        try (Scanner in = new Scanner(System.in)) {
            int target = 5;
            int[][] arr = new int[3][5];
            System.out.println("Enter numbers: ");
            for (int row = 0; row < 3; row++) {
                for (int col = 0; col < arr[row].length; col++) {
                    arr[row][col] = in.nextInt();
                }
            }

            int[] ans = linearsearch(arr, target);
            System.out.println("Index of target: " + Arrays.toString(ans));
            for (int row = 0; row < 3; row++) {
                for (int col = 0; col < arr[row].length; col++) {
                    System.out.print(arr[row][col] + "  ");
                }
                System.out.println();
            }
        }

    }

    static int[] linearsearch(int[][] arr, int target) {
        if (arr.length == 0) {
            return new int[] { -1, -1 };
        }

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[] { row, col };
                }
            }
        }
        return new int[] { -1, -1 };
    }

}
