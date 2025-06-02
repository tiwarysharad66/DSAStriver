package Recursion.Arrays;

public class SortedArray {
    public static void main(String[] args) {
        int []arr = {1,2,8,4};
        System.out.println(sort(arr,0));
    }
    static boolean sort(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
//        else if(arr[i]<arr[i+1]){
//           return sort(arr,i+1);
//        }
//       return false;
        return arr[i]<arr[i+1]&& sort(arr,i+1);
    }
}
