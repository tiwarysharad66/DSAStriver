import java.util.HashMap;

public class LongestSubarrayK {
    public static void main(String[] args) {
int arr[] = {10,5,2,7,1,-10};
        System.out.println(longestSubarray(arr,15));
    }
    public static int longestSubarray(int[] arr, int k) {
//        int sum = 0;
//        int max= Integer.MIN_VALUE;
//        for(int i = 0;i<arr.length;i++){
//            sum=0;
//            for(int j = i;j<arr.length;j++){
//                sum+=arr[j];
//                if(sum==k){
//                    max = Math.max(max,j-i+1);
//                    break;
//                }
//            }
//        }
//        return max; only for positives
        int sum = 0;
        int max= Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            sum=0;
            for(int j = i;j<arr.length;j++){
                sum+=arr[j];
                if(sum==k){
                    max = Math.max(max,j-i+1);

                }
            }
        }
        return max;//for all positives and negatives.
    }
}
