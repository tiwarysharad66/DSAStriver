package BinarySearch;

public class Search_Rotated_Sortedarray {
    public static void main(String[] args) {
int arr[] = {4,5,6,7,0,1,2};
        System.out.println(searchrotated(arr,0));
    }
    public static int searchrotated(int arr[],int target){
        int size = arr.length;
        int low = 0;
        int high = size-1;
        while(low<=high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[low] <= arr[mid] && arr[low] > target) {
                low = mid + 1;
            }
            else{
                high = mid-1;
            }
        }
        return -1;
    }
}
