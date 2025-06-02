package BinarySearchprac;

public class ques2 {
    public static void main(String[] args) {

    }
    static int findceil(int arr[],int x){
int low = 0;
int high = arr.length-1;
int ans = -1;
while(low<=high){
    int mid = (low+high)/2;
    if(arr[mid]<x){
        low = mid+1;
    }else{
        ans=  mid;
        high = mid-1;
    }
}
return ans;
    }
    static int findFloor(int[] arr, int x) {
       int low = 0;
       int ans = -1;
       int high = arr.length-1;
       while(low<=high){
           int mid = (low+high)/2;
           if(arr[mid]>x){
               high = mid-1;
           }
           else if(arr[mid]<=x){
               ans = mid;
               low = mid+1;
           }
       }
       return ans;
    }
}
