package BinarySearch;

import java.util.Arrays;

public class floor_CeilSortedArray {
    public static void main(String[] args) {
int arr[] = {3 ,4, 4 ,7 ,8 ,10};
        System.out.println(Arrays.toString(getFloorAndCeil(arr, arr.length, 8)));
    }
    public static int[] getFloorAndCeil(int[] a, int n, int x) {
        int size = a.length;
        int low = 0;
        int high = size-1;
        int floor = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(a[mid]>x){
                high = mid-1;
            }
            else{
                floor = a[mid];
                low = mid+1;
            }
        }
        low = 0;
        high = size-1;
        int ceil = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(a[mid]>=x){
                ceil = a[mid];
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        int[] ans = {floor,ceil};
        return ans;
    }
}
