package slidingwindow;
import java.util.Scanner;
public class Leetcode1248 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int k = s.nextInt();
        int[] arr = new int[size];
        for(int i =0;i<size;i++){
            arr[i] = s.nextInt();
        }
        System.out.println(numberOfSubarrays(arr,k));
    }
    public static int numberOfSubarrays(int[] nums, int k) {
         int size = nums.length;
         int i =0;
         int j = 0;
         int count = 0;
         int count2 = 0;
         while(j<size){
             if(nums[j]%2!=0){
                 count++;
             }
             if(j-i+1<k){
                 j++;
             }
             else if(j-i+1==k){
                 if(count==k){
                     count2++;
                 }
                 if(nums[i]%2!=0){
                     count--;
                 }
                 i++;
                 j++;
             }
         }
         return count2;
    }
}
