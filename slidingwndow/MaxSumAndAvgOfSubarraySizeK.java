package slidingwndow;

import java.util.Scanner;

public class MaxSumAndAvgOfSubarraySizeK {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int k = s.nextInt();
        int arr[]  = new int[size];
        for(int i = 0;i<arr.length;i++){
            arr[i] = s.nextInt();
        }
        System.out.println(max(arr,k));
    }
    public static double max(int []arr,int k){
        int size = arr.length;
        int i = 0;
        int j = 0;
        int max = Integer.MIN_VALUE;
        double avg = 0;
        int sum = 0;
        while(j<size){
            sum+=arr[j];
            if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){
                // avg= (double) sum /(j-i+1);
                max = Math.max(max,sum);
                sum-=arr[i];
                j++;
                i++;
            }
        }
        avg = (double)max/k;
        return avg;
    }

}
