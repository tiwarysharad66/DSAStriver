package Recursion_op;

import java.util.Arrays;

public class reversearrfromltor {
    public static void main(String[] args) {
        int arr[] = {5};
      rev(1,1,arr);
        System.out.println(Arrays.toString(arr));
    }
    static void rev(int left,int right,int arr[]){
        int i = left-1;
        int j = right-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
