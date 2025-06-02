package practice;

import java.util.Arrays;

public class rotateKsubarray {
    public static void main(String[] args) {
int arr[] = {1,2,3,4,5};
        System.out.println(Arrays.toString(reversek(arr, 3)));
    }

    public static int[] reversek(int arr[], int k) {
        int size = arr.length;
        int a = size;
        while (a > k) {
            a = a - k;
        }
        int n = size - a - 1;
        for (int i = 0; i <= n; i=i+k) {
            reverse(i, i + k - 1, arr);
        }
        return arr;
    }

    public static void reverse (int start,int end ,int []arr){
int size = 0;
while(start<=end){
    int temp = arr[start];
     arr[start] = arr[end];
     arr[end] = temp;
     start++;
     end--;
}
    }

}

