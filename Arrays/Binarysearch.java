package Arrays;

public class Binarysearch {
    public static void main(String[] args) {
int []arr= {2,3,4,34,24};
        System.out.println("the index of target is " +binary(arr,25));
    }
    public static int binary(int []arr,int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid  = (start+end)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target) {
                end = mid-1;
            }
            else{
start = mid+1;
            }

        }
        return -1;
    }
}
