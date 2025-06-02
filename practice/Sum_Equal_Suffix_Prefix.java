package practice;

import java.util.Arrays;

public class Sum_Equal_Suffix_Prefix {
    public static void main(String[] args) {
int arr[] = {1,1,1,1,1,1};
        System.out.println(HalfSum(arr));
    }
    public static boolean HalfSum(int []arr) {
//        int size = arr.length;
//        int[] prefix = new int[size];
//        int suffix[] = new int[size];
//        prefix[0] = arr[0];
//        for (int i = 1; i < size; i++) {
//            prefix[i] = prefix[i - 1] + arr[i];
//        }
//        suffix[size - 1] = arr[size - 1];
//        for(int i = size-2;i>=0;i--){
//            suffix[i] = suffix[i+1]+arr[i];
//        }
//        for(int i = 0;i<prefix.length-1;i++){
//            if(prefix[i]==suffix[i+1]){
//                return true;
//            }
//    }
//        System.out.println(Arrays.toString(prefix));
//        System.out.println(Arrays.toString(suffix));
       int psum = 0;
       int ssum = 0;
       int totalsum = 0;
       for(int i = 0;i<arr.length;i++){
           totalsum+=arr[i];
       }
       for(int i = 0;i< arr.length;i++){
           psum+=arr[i];
           ssum = totalsum-psum;
           if(psum==ssum){
               return true;
           }
       }
return false;
    }
}
