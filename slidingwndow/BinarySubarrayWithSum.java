package slidingwndow;

public class BinarySubarrayWithSum {
    public static void main(String[] args) {
int arr[] = {1,0,1,0,1};
int goal = 2;
        System.out.println(numSubarraysWithSum(arr,goal));
    }
    public static int numSubarraysWithSum(int[] nums, int goal) {
        int size = nums.length;
        int i = 0;
        int j = 0;
        int c = 0;
        int sum = 0;
        while(j<size){
            sum+=nums[j];
//            if(sum<goal){
//                j++;
//            }
            if(sum>goal){
                while(sum>goal){
                    sum-= nums[i];
                    i++;
                }

            }
            c +=j-i+1;
            j++;

        }
        int k = goal-1;

        i=0;
        j=0;
        int count =0;
        int sum2 =0;
        while(j<size&&k>=0){
            sum2+=nums[j];
//            if(sum2<k){
//                j++;
//            }
             if(sum2>k){
                while(sum2>k){
                    sum2-=nums[i];
                    i++;
                }

            }
            count +=j-i+1;
            j++;
        }
        return c-count;
    }
}
