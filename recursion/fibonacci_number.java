package recursion;

import java.util.Scanner;

public class fibonacci_number {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int input=sc.nextInt();

    }

    static int fibo(int n) {
        if (n < 2) {
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}
