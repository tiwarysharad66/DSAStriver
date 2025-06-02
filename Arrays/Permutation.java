package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Permutation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int arr[] = new int[size];
        for(int i = 0;i<size;i++){
            arr[i] = s.nextInt();
        }
        nextPermutation(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void nextPermutation(int[] nums) {
        int ind = -1;
     for(int i = nums.length-2;i>=0;i--){
         if(nums[i]<nums[i+1]){
             ind = i;
             break;
         }
     }
     if(ind==-1){
         reverse(nums);
     }
     for(int i = nums.length-1;i>=0;i--){
         if(nums[ind]<nums[i]){
             int temp = nums[ind];
             nums[ind] = nums[i];
             nums[i] = temp;
             break;
         }
     }
     rev(ind+1,nums.length-1,nums);
    }
    public static void rev(int i,int j,int arr[]){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void reverse(int arr[]){
        int i = 0;
        int j = arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
