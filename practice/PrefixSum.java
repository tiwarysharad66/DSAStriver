package practice;

import java.util.Arrays;
import java.util.Scanner;

public class PrefixSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int []arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println(Arrays.toString(prefixsum(arr)));
    }
    public static int[] prefixsum(int arr[]){
//        int size = arr.length;
//        int prefix[] = new int[size];
//        prefix[0] =  arr[0];
//        for (int i = 1; i <size ; i++) {
//            prefix[i] = prefix[i-1]+arr[i];
//        }
//        return prefix;
        //without extra space
        int sum = arr[0];
        for(int i = 1;i<arr.length;i++){
//            sum+=arr[i];
//            arr[i] = sum;
            arr[i] = arr[i-1]+arr[i];
        }
        return arr;
    }
}
