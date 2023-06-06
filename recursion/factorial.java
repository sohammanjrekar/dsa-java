package recursion;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int fact = 1;
        int ans = factorial(num);
        System.out.println(ans);
        sc.close();
    }

    static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        int factorial=n*factorial(n-1);
        return factorial;
    }
}
