package slidingwindow;

import java.util.Scanner;

public class Leetcode930 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int goal = s.nextInt();
        int[] arr = new int[size];
        for(int i =0;i<size;i++){
            arr[i] = s.nextInt();
        }
        System.out.println(numSubarraysWithSum(arr,goal));
    }
    public static int numSubarraysWithSum(int[] nums, int goal) {
        int n = nums.length;
 int[] prefix = new int[n];
 int count =0;
 prefix[0]= nums[0];
 for(int i =1;i<n;i++){
     prefix[i] = prefix[i-1]+nums[i];
 }
 int sum =0;
 for(int i=0;i<n;i++){
     sum =0;
     for(int j=i;j<n;j++){
         if(i==0){
             sum = prefix[j];
             if(sum==goal){
                 count++;
             }
         }
         else{
             sum = prefix[j]-prefix[i-1];
             if(sum==goal){
                 count++;
             }
         }
     }
 }
 return count;
    }
}
