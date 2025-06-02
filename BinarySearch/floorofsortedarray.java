package BinarySearch;

public class floorofsortedarray {
    public static void main(String[] args) {
        int[] arr =  {1,2,8,10,11,12,19};
        System.out.println(findFloor(arr,arr.length,5));

    }
    static int findFloor(int[] arr, int n, long x) {
        int size = arr.length;
        int idx = -1;
        int low = 0;
        int high = size-1;
        while(low<=high){
            int mid = low+high/2;
            if(arr[mid]==x){
                return mid;
            }
            if(arr[mid]>x){
                high = mid-1;
            }
            else{
                idx = mid;
                low = mid+1;
            }
        }
        return idx;
    }


}
