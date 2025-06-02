package BinarySearchprac;

public class ques4 {
    public static void main(String[] args) {

    }
    public static int[] searchRange(int[] arr, int x) {
       int low = 0 ;
       int high = arr.length-1;
       int ans  = -1;
       while(low<=high){
           int mid = (low+high)/2;
           if(arr[mid]==x){
               ans = mid;
               high= mid-1;
           }
           else if(arr[mid]<x){
               low = mid+1;
           }
           else{
               high = mid-1;
           }
       }
        low = ans+1;
        if(ans==-1){
            return new int[]{-1,-1,};
        }
       high = arr.length-1;
       int ans2= -1;

       while(low<=high){
           int mid = (low+high)/2;
           if(arr[mid]==x){
               ans2 = mid;
               low = mid+1;
           }
           else if(arr[mid]<x){
               low = mid+1;
           }
           else{
               high = mid-1;
           }
       }
       return new int[]{ans,ans2};
    }

}
