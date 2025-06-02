package Binarysearc;

import java.util.Arrays;
import java.util.Scanner;

public class first_last_occurence {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int arr[] = new int[size];
        int target = s.nextInt();
        for(int i = 0;i<size;i++){
            arr[i] = s.nextInt();
        }
        System.out.println(Arrays.toString(searchRange(arr, target)));
    }
    public static int first(int[] nums, int target) {
int size = nums.length;
int low = 0;
int idx = -1;
int high = size-1;
while(low<=high){
    int mid = (low+high)/2;
    if(nums[mid]==target){
       idx = mid;
       high = mid-1;
    }
    else if(nums[mid]<target){
        low = mid+1;
    }
    else{
        high = mid-1;
    }
}
return idx;
    }
    public static int[] searchRange(int[] nums, int target) {
int idx  = first(nums,target);
int low = 0;
int high = nums.length-1;
int idx2 = -1;
while(low<=high){
    int mid = (low+high)/2;
    if(nums[mid]==target){
        idx2 = mid;
        low = mid+1;
    }
    else if(nums[mid]<target){
        low = mid+1;
    }
    else{
        high = mid-1;
    }
}
return new int[]{idx,idx2};
    }

}
