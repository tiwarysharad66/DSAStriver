package BinarySearch;

import java.util.Arrays;

public class First_Last_Element_SortedArray {
    public static void main(String[] args) {
int[] arr = {1,2,3,2,5};
        System.out.println(Arrays.toString(searchRange(arr, 2)));
    }
    public static int[] searchRange(int[] nums, int target) {
int size = nums.length;
int low = 0;
int high = size-1;
int idx = -1;
int ans[] = {-1,-1};
for(int i = 0;i<size;i++){
    if(nums[i]==target){
        if(idx==-1){
           idx = i;
            ans[0] = idx;
        }
       else{
           idx = i;
         ans[1] = idx;
        }
    }
}
return ans;
    }
}
