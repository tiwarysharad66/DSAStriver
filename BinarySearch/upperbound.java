package BinarySearch;

public class upperbound {
    public static void main(String[] args) {
int arr[] = {5, 6, 8, 9, 6, 5, 5, 6};
        System.out.println(getFloorAndCeil(9, arr) + " " + lowerbound(5,arr));
    }
    public static int lowerbound(int x,int arr[]){
        int size = arr.length;
        int low = 0;
        int idx = -1;
        int high = arr.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]>=x){
                high=mid-1;
            }
            else{
                idx= mid;
                low = mid+1;
            }
        }
        return idx;
    }
    public static int getFloorAndCeil(int x, int[] arr) {
        int size = arr.length;
        int low = 0;
        int high = size-1;
        int idx = -1;
        while(low<=high){
            int mid= (low+high)/2;
            if(arr[mid]>x){
                idx = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return idx;
    }
}
