package Algorithms.recursion;

public class reversestring {
    static void revrse(String str,int n){
if(n==0){
    System.out.print(str.charAt(n));
    return;
} System.out.print(str.charAt(n));
        revrse(str, n-1);
    }
    public static void main(String[] args) {
        String str="Soham";
        revrse(str,str.length()-1);
    }
}
