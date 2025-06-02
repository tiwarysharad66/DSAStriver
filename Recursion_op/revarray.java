package Recursion_op;
import java.util.Arrays;
public class revarray {
    public static void main(String[] args) {
        int arr[] = {3,1,2};
        rev(0,arr.length-1,arr);
        System.out.println(Arrays.toString(arr));
    }
  static void  rev(int left,int right,int arr[]){
        if(left>right){
            return;
        }
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] =temp;
        rev(left+1,right-1,arr);
  }
}
