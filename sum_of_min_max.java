import java.util.Arrays;

public class sum_of_min_max {
    public static void main(String[] args) {
        int n = 13;
        int[] arr = { -838, 444 ,-551, 757, -154, 114, -857, 475 ,-123, 618, -565, 560, -829};
        int ans = findSum(arr, n);
        System.out.println(ans);
    }

    static int findSum(int A[], int N) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0;i<N;i++){
            if (A[i] < min) {
                min = A[i];
            }
            if (A[i] > max) {
                System.out.println(A[i]+" "+max);
                max = A[i];
            }
        }
        System.out.println(min + " " + " " + max);
        int sum = min + max;
        return sum;
    }
}
