package patterns;

public class patterns {
    public static void main(String[] args) {
        pattern8(4);
    }

    static void pattern1(int n) {
        // patern1
        // *
        // * *
        // * * *
        // * * * *
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
        // patern2
        // * * * *
        // * * * *
        // * * * *
        // * * * *
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n) {
        // patern3
        // * * * *
        // * * *
        // * *
        // *
        for (int row = 1; row <= n; row++) {
            for (int col = n - row + 1; col >= 1; col--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
        // patern4
        // 1
        // 1 2
        // 1 2 3
        // 1 2 3 4
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n) {
        // patern5
        // *
        // * *
        // * * *
        // * * * *
        // * * *
        // * *
        // *
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int row = 1; row <= n - 1; row++) {
            for (int col = n - row; col >= 1; col--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern6(int n) {
        // patern6
        // *
        // * *
        // * * *
        // * * * *
        // * * *
        // * *
        // *
        for (int row = 1; row <= 2 * n - 1; row++) {
            int rowtotal = row > n ? 2 * n - row : row;
            int spaces = n - rowtotal;
            for (int col = spaces; col >= 1; col--) {
                System.out.print(" ");
            }
            for (int col = 1; col <= rowtotal; col++) {
                System.out.print(" ");
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern7(int n) {
        // patern7
        // 1 1 1 1 1 1 1
        // 1 2 2 2 2 2 1
        // 1 2 3 3 3 2 1
        // 1 2 3 4 3 2 1
        // 1 2 3 3 3 2 1
        // 1 2 2 2 2 2 1
        // 1 1 1 1 1 1 1
        for (int row = 1; row < 2 * n; row++) {
            for (int col = 1; col < 2 * n; col++) {
                int index = Math.min(Math.min(row, col), Math.min(2 * n - row, 2 * n - col));
                System.out.print(index + " ");
            }
            System.out.println();
        }
    }

    static void pattern8(int n) {
        // patern8
        // 4 4 4 4 4 4 4
        // 4 3 3 3 3 3 4
        // 4 3 2 2 2 3 4
        // 4 3 2 1 2 3 4
        // 4 3 2 2 2 3 4
        // 4 3 3 3 3 3 4
        // 4 4 4 4 4 4 4
        for (int row = 1; row < 2 * n; row++) {
            for (int col = 1; col < 2 * n; col++) {
                int index = n - Math.min(Math.min(row, col), Math.min(2 * n - row, 2 * n - col)) + 1;
                System.out.print(index + " ");
            }
            System.out.println();
        }
    }

}
