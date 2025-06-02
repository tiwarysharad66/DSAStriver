package Binarysearc;

import java.util.Scanner;

public class IterativeCode {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size= s.nextInt();
        int arr[] = new int[size];
        int target = s.nextInt();
        for (int i = 0; i <size ; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println(bs(arr,target));
    }
    public static int bs(int []arr,int target){
        int size= arr.length;
        int low = 0;
        int high= size-1;
        while(low<=high){
            int mid = low+((high-low)/2);
            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]>target){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return -1;
    }
}
