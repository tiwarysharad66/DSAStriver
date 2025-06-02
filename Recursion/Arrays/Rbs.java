package Recursion.Arrays;
public class Rbs {
    public static void main(String[] args) {
        int arr[] = {5,6,7,8,9,1,2,3};
        System.out.println(rotated(arr,9,0,arr.length-1));
    }
   public static int rotated(int []arr,int key,int s,int e) {
       if (s > e) {
           return -1;
       }
       int mid = s + (e - s) / 2;
       if (arr[mid] == key) {
           return mid;
       }
       if (arr[s] <= arr[mid]) {
           if (key >= arr[s] && key <= arr[mid]) {
//                    e = mid-1;
               return rotated(arr, key, s, mid - 1);
           } else {
//                    s = mid+1;
               return rotated(arr, key, mid + 1, e);
           }
       }
       if (key >= arr[mid] && key <= arr[e]) {
           //s = mid+1;
           return rotated(arr, key, mid + 1, e);
       }
else{
//           e = mid-1;
           return rotated(arr, key, s, mid-1);
       }
//


   }
}
