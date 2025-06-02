package practice;
import java.util.Arrays;
public class rotatearray {
    public static void main(String[] args) {
int arr[] = {1,2,3,4};
rotate(arr,2);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] rotate(int arr[],int k){
        int size = arr.length;
        k = k%size;
        reverse(0,size-1,arr);
        reverse(0,k-1,arr);
        reverse(k,size-1,arr);
        return arr;
    }
    public static void reverse(int start,int end,int arr[]){
        int size = arr.length;
        while(start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
