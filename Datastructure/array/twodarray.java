package array;

import java.util.Arrays;
import java.util.Scanner;

public class twodarray {
    public static void main(String[] args) {
        int[][] matrix = { { 4, 5 }, { 34, 67 }, { 8, 9 } };

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 2; j++) {

                System.out.println("matrix[" + i + "][" + j
                        + "]=" + matrix[i][j]);
            }
        }
    }
}
