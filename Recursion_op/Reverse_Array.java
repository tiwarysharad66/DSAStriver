package Recursion_op;
import java.util.Arrays;
import java.util.Collections;

public class Reverse_Array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int left = 0;
        int right = arr.length-1;
//        System.out.println(Arrays.toString(f(left,right,arr)));
//        System.out.println(Arrays.toString(f(left,arr)));
        f(left,arr);
        System.out.println(Arrays.toString(arr));
    }
//    static int[] f(int left, int right, int[] arr){
//        if(left>=right){
//            return arr;
//        }
//        int temp = arr[right];
//        arr[right] = arr[left];
//        arr[left] = temp;
//      return  f(left+1,right-1,arr);
//    }
    //without 2nd variable
//    static int [] f(int left,int[]arr){
//        if(left>=arr.length/2){
//            return arr;
//        }
//        int temp = arr[arr.length-left-1];
//        arr[arr.length-left-1] = arr[left];
//        arr[left] = temp;
//        return f(left+1,arr);
//    }
static void  f(int left,int[]arr){
    if(left>=arr.length/2){
        return ;
    }
    int temp = arr[arr.length-left-1];
    arr[arr.length-left-1] = arr[left];
    arr[left] = temp;
     f(left+1,arr);
}
}
