package BinarySearch;

public class lowerbound {
    public static void main(String[] args) {
        int arr[] = {1,2,3,3,5,8,8,10,10,11};
        System.out.println(index(arr,9));
    }
    public static int index(int arr[],int x){
        int size = arr.length;
        int low= 0;
        int high = arr.length;
        int idx= size;
        while(low<=high){
            int mid = low+(high-low)/2;
            idx= mid;
            if(arr[mid]>=x){
                high = mid-1;
            }
            else if(arr[mid]<=x){
                low= mid+1;
            }
        }
        return idx;
    }
}
