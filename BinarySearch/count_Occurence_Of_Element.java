package BinarySearch;

public class count_Occurence_Of_Element {
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2, 2, 2, 3};
        System.out.println(count(arr,7,2));
    }
    public static int count(int[] arr, int n, int x) {
        int size = arr.length;
        int low = 0;
        int high = size-1;
        int ans= -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]<x){
                low= mid+1;
            }
            else if(arr[mid]>x){
                high = mid-1;
            }
            else{
                high = mid-1;
                ans = mid;

            }
        }
        int second = -1;
        low = 0;
        high = size-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==x){
                second = mid;
                low = mid+1;
            }
            else if(arr[mid]<x){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        int count = 0;
        if(second==-1&&ans==-1) {
            return 0;
        }
        count = second-ans+1;
        return count;
    }
}
