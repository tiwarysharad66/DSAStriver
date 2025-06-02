package slidingwndow;

public class NumberOfConsecutive1 {
    public static void main(String[] args) {
int nums[]= {1,1,1,0,0,0,1,1,1,1,0};
        System.out.println(longestOnes(nums,2));
    }

    public static int longestOnes(int[] nums, int k) {
        int i = 0;
        int j = 0;
        int size = nums.length;
        int max = 0;
        int count = 0;
        while(j<size){
            if(nums[j]==0){
                count++;
            }
         if(count>k){
             while(count>k){
                 if(nums[i]==0){
                     count--;
                 }
                 i++;
             }
         }
if(count<=k){
    max = Math.max(max,j-i+1);
    j++;
}
        }
        return max;
    }
}
