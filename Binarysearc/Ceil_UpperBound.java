package Binarysearc;

import java.util.Arrays;
import java.util.Scanner;

public class Ceil_UpperBound {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        int x = s.nextInt();
        System.out.println(Arrays.toString(getFloorAndCeil(x, arr)));
    }
    public static int floor(int x,int arr[]){
        int size = arr.length;
        int max = -1;
        int idx = -1;
        int low = 0;
        int high = size-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==x){
                return mid;
            }
            else if(arr[mid]>x){
                high = mid-1;
            }
            else{
                low = mid+1;
                if(arr[mid]>max){
                    idx =mid;
                    max = arr[mid];
                }
            }

        }
        return max;
    }
    public static int ceil(int x, int arr[]){
        int size = arr.length;
        int low = 0;
        int high = size-1;
        int min = Integer.MAX_VALUE;
        int idx = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==x){
                return mid;
            }
            else if(arr[mid]>x){
                if(arr[mid]<min){
                    min= arr[mid];
                    idx = mid;
                }
                high = mid-1;
            }
            else{
                low = mid+1;
            }
//            8
//            5 6 8 9 6 5 5 6
//            7
        }
        return min;
    }
        public  static int[] getFloorAndCeil(int x, int[] arr) {
        Arrays.sort(arr);
 return new int[]{floor(x,arr),ceil(x,arr)};
        }
    }

