package BinarySearchprac;

public class ques6 {
    public static void main(String[] args) {

    }
    public static int findPeakElement(int[] nums) {
      int low = 0;
      int high = nums.length-1;
      int ans = -1;
      while(low<=high){
          int mid = (low+high)/2;
          if(nums[mid]>nums[mid+1]&&nums[mid]>nums[mid-1]){
              ans  = mid;

          }
          else{
              if(nums[mid]<nums[mid-1]){
                  high = mid-1;
              }
              else{
                  low = mid+1;
              }
          }
      }
      return ans;
    }
}
