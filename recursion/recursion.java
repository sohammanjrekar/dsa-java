package recursion;

public class recursion {
    public static void main(String[] args) {
        message(1);
    }

    static void message(int n) {

        if (n == 5) {
            System.out.println("hello world");
            return;
        }
        System.out.println("hello world");
        message(n + 1);

    }
}
