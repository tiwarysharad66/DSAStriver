package BinarySearchprac;

public class ques5 {
    public static void main(String[] args) {

    }
    public static int first(int arr[],int x){
        int low = 0;
        int high  = arr.length-1;
        int ans = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==x){
                high = mid-1;
                ans = mid;
            }
            else if(arr[mid]<x) {
               low = mid+1;
            }
            else{
                high  =mid-1;
            }
        }
        return ans;
    }
    static int second(int[] arr, int x){
        int low = 0;
        int ans2 = -1;
        int high = arr.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==x){
                low = mid+1;
                ans2  = mid;
            }
            else if(arr[mid]<x){
                low = mid+1;
            }
            else{
                high  = mid-1;
            }
        }
        return ans2;
    }
 static int countFreq(int[] arr, int x) {
int first = first(arr,x);
int second = second(arr,x);
return second-first+1;
    }
}
