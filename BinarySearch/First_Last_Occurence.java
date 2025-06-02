package BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;

public class First_Last_Occurence {
    public static void main(String[] args) {
int arr[] = {5,7,7,8,8,10};
        System.out.println(Arrays.toString(searchRange(arr, 8)));
    }
    public static  int[] searchRange(int[] nums, int target) {
int size = nums.length;
int low = 0;
int high = size-1;
int ans= -1;

ArrayList<Integer> list = new ArrayList<>();
while(low<=high){
    int mid = (low+high)/2;
    if(nums[mid]<target){
        low= mid+1;
    }
    else if(nums[mid]>target){
        high = mid-1;
    }
    else{
        high = mid-1;
        ans = mid;

    }
}
int second = -1;
low = 0;
high = size-1;
while(low<=high){
    int mid = (low+high)/2;
    if(nums[mid]==target){
        second = mid;
        low = mid+1;
    }
    else if(nums[mid]<target){
        low = mid+1;
    }
    else{
        high = mid-1;
    }
}
list.add(ans);
list.add(second);
int a[] = new int[list.size()];
a[0] = list.get(0);
a[1] = list.get(1);

return a;
    }
}
