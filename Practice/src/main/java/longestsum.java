import java.util.Arrays;
import java.util.HashMap;

public class longestsum {
    public static void main(String[] args) {
        int arr[] = {10,5,2,7,1,9};
        System.out.println(lenOfLongestSubarr(arr,15));
    }
    public static int lenOfLongestSubarr(int[] arr, int k) {
//        int size = arr.length;
//        int i = 0;
//        int j = 0;
//        int sum = 0;
//        int max =Integer.MIN_VALUE;
//        while(j<size){
//            sum+=arr[j];
//            if(sum==k){
//                max = Math.max(j-i+1,max);
//            }
//            if(sum>k){
//                while(sum>k){
//                    sum-=arr[i];
//                    i++;
//                }
//            }
//            j++;
//        }
//        return max;
        //that was for only array containing positive integers sliding window
        //now Hashing Solution
        int size = arr.length;
        HashMap<Integer,Integer> h = new HashMap<>();
        int len = Integer.MIN_VALUE;
        int prefix = 0;
        for(int i = 0;i<size;i++){
            prefix+=arr[i];
            if(prefix==k){
                len = Integer.max(len,i+1);
            }
            else{
                if(h.containsKey(prefix-k)){
                    len = Integer.max(len,i-h.get(prefix-k));
                }

            }
            h.put(prefix,i);
        }
        return len;
    }
}
