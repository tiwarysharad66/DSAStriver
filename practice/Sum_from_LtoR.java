package practice;

import java.util.Scanner;

public class Sum_from_LtoR {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int arr[] = new int[size+1];
for(int i = 1;i<=size;i++){
    arr[i] = s.nextInt();
}
int i = s.nextInt();
int j = s.nextInt();
        System.out.println(rangesum(arr,i,j));
    }
    public static int rangesum(int arr[],int i,int j){
        int size= arr.length;
        int prefix[] = new int[size];
//        prefix[1] = arr[1];
        for(int k = 2;k<size;k++){
//            prefix[k]= prefix[k-1]+arr[k];
            arr[k] = arr[k-1]+arr[k];
        }
//        int sum = prefix[j]-prefix[i-1];
        int sum = arr[j]-arr[i-1];

        return sum;
        //here in question array of 1 indexed
    }
}
