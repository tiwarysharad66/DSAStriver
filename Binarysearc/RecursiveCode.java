package Binarysearc;

import java.util.Scanner;

public class RecursiveCode {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size= s.nextInt();
        int arr[] = new int[size];
        int target = s.nextInt();
        for (int i = 0; i <size ; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println(bs(arr,target,0,arr.length-1));
    }
    public static int bs(int arr[],int target,int low,int high){
        if(low>high){
            return -1;
        }
        int mid = low+((high-low)/2);
        if(arr[mid]==target){
            return mid;
        }
        else if(arr[mid]>target){
           return bs(arr,target,low,mid-1);
        }
        else  {
           return bs(arr,target,mid+1,high);
        }

    }
}
