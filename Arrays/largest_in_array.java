package Arrays;

import java.sql.SQLOutput;

public class largest_in_array {
    public static void main(String[] args) {
        int arr[] = {10,14,21,18,23,12};
        System.out.println(largest(arr));
    }
    public static int largest(int []arr){
        int smallest  = Integer.MAX_VALUE;
        int largestnum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largestnum){
                largestnum = arr[i];

            }
            if(arr[i]<smallest){
                smallest= arr[i];
            }
        }
        System.out.println( "smallest number"+ smallest);
        return largestnum;
    }
}
