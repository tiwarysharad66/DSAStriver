package Two_Darrays;

import java.util.Scanner;

public class SumOfRectangleSPrefixSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int r = s.nextInt();
        int c = s.nextInt();
        int matrix[][] = new int[r][c];
        for(int i = 0;i<r;i++){
            for(int j = 0;j<c;j++){
                matrix[i][j] = s.nextInt();
            }
        }
        int l1 = s.nextInt();
        int l2 = s.nextInt();
        int r1 = s.nextInt();
        int r2 = s.nextInt();
        System.out.println(sum(l1,l2,r1,r2,matrix));
    }
    public static void findprefixsum(int[][] arr){
        if(arr.length>0){
            for(int i = 0;i<arr.length;i++){
                for(int j = 1;j<arr[i].length;j++){
                    arr[i][j] += arr[i][j-1];
                }
            }
        }
    }
    public static int sum(int l1,int l2,int r1,int r2,int arr[][]){
        int sum =0;
        findprefixsum(arr);
        for(int i = l1;i<=l2;i++){
            if(r1>0){
                sum+= arr[i][r2] - arr[i][r1-1];
            }
         else{
             sum+=arr[i][r2];
            }
        }
        return sum;
    }
}
