package Recursion;
public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println(binary(arr,4,0,arr.length-1));
    }
    static int binary(int arr[],int target,int start,int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (arr[mid] > target) {
            return binary(arr, target, start = start, end = mid - 1);
        }
        return binary(arr, target, start = mid + 1, end);
    }
}
