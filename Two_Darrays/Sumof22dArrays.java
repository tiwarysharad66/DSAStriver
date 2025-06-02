package Two_Darrays;

import java.util.Arrays;
import java.util.Scanner;

public class Sumof22dArrays {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int rows = s.nextInt();
        int cols = s.nextInt();
        int rows2 = s.nextInt();
        int cols2 = s.nextInt();
        int [][]arr = new int[rows][cols];
        int [][]arr2 = new int[rows2][cols2];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr2[i][j] = s.nextInt();
            }
        }
       int ans[][]= sum(arr,arr2);
       for(int i = 0;i<ans.length;i++){
           for(int j = 0;j<ans[i].length;j++){
               System.out.print(ans[i][j]+" ");
           }
           System.out.println();
       }

    }
    public static int[][] sum(int[][]arr,int arr2[][]){
        if(arr.length!=arr2.length||arr[0].length!=arr2[0].length){
            return new int[][]{{0}};        }
     int sum[][] = new int[arr.length][arr[0].length];
        for(int i = 0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                sum[i][j] = arr[i][j]+arr2[i][j];
            }
        }
        return sum;
    }

}
