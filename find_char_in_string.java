import java.util.Scanner;

public class find_char_in_string {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char target = in.next().charAt(0);;
        String arr = "soham";
        boolean ans =linearsearch(arr, target);
        System.out.println("stutus of target: "+ans);

    }
    static boolean linearsearch(String arr, char target){
        if(arr.length()==0){
            return false;
        }
       
            for(char ch:arr.toCharArray()){
                if(ch==target){
                    return true;
                }
            }
        return false;
    }
}
