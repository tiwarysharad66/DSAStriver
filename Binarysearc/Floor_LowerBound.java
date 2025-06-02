package Binarysearc;

import java.util.Scanner;

public class Floor_LowerBound {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int []arr = new int[size];
        int k = s.nextInt();
        for(int i = 0;i<size;i++){
            arr[i] = s.nextInt();
        }
        System.out.println(findFloor(arr,k));
    }
    public static int findFloor(int[] arr, int k) {
        int size = arr.length;
        int max = -1;
        int idx = -1;
        int low = 0;
        int high = size-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==k){
                return mid;
            }
        else if(arr[mid]>k){
               high = mid-1;
            }
        else{
            low = mid+1;
            if(arr[mid]>max){
                idx = mid;
                max = arr[mid];

            }
            }

    }
return idx;
    }
}
