package Binarysearc;

import java.util.Scanner;

public class RotatedSortedArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int target = s.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<arr.length;i++){
            arr[i] = s.nextInt();
        }
        System.out.println(search(arr,target));
    }
    public static int search(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if(arr[mid]==target){
                return mid;
            }
            if (arr[low] <= arr[mid]) {
                if (arr[low] <= target && arr[mid] >= target) {
                    high = mid - 1;
                }
                else {
                    low = mid + 1;
                }
            }
            else if (arr[mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }


 return -1;
    }
}
