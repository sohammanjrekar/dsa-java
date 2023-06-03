package trash;
import java.util.Scanner;

public class find_floor_using_bianry_search {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,9,10};
Scanner sc=new Scanner(System.in);
int target=sc.nextInt();
System.out.println(binarysearch(arr, target)+"   "+arr[binarysearch(arr, target)]);
    }
    static int binarysearch(int[] arr, int target) {
int start=0;
int end=arr.length-1;
while(start<=end){
int mid=start+((end-start)/2);
if(target<arr[mid]){
    end=mid-1;
}else if(target>arr[mid]){
start=mid+1;
}else{
    return mid;
}
}
return end;
    }
}
