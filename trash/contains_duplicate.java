package trash;

public class contains_duplicate {
    public static void main(String[] args) {
        int[] arr = {7,10,5,5,6,6,4,10,5,4,9,4,9,6,5,9,6,3,6,5,6,7,7,4,9,9,10,5,8,1,8,3,2,7,5,10,1,8,5,8,4,3,6,4,9,4,2,8,3,2,2,1,5,6,3,2,6,1,8,6,2,9,1,4,5,10,8,5,10,5,10,1,4,8,3,6,4,10,9,1,1,1,2,2,9,6,6,8,1,9,2,5,5,2,1,8,5,2,3,10};
        boolean ans = containsDuplicate(arr);
        System.out.println(ans);
    }

    static boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                System.out.println(nums[i]+" "+ nums[j]+"   "+(nums[i] ^ nums[j]));
                if ((nums[i] ^ nums[j]) == 0){
                    return true;
                }
                if((nums[i] ^ nums[j]) == 1){
                    return false;
                }
            }
        }
        return false;
    }
}
