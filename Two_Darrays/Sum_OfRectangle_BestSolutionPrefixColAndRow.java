package Two_Darrays;

import java.util.Arrays;
import java.util.Scanner;

public class Sum_OfRectangle_BestSolutionPrefixColAndRow {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int rows = s.nextInt();
        int cols = s.nextInt();
        int matrix[][] = new int[rows][cols];
        for(int i = 0;i<rows;i++){
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = s.nextInt();
            }
        }
        int l1 = s.nextInt();
        int r1 = s.nextInt();
        int l2 = s.nextInt();
        int r2 = s.nextInt();

        System.out.println(sum(l1,r1,l2,r2,matrix));
    }
    public static void prefixsumrows(int [][] matrix){
        for(int i =0;i<matrix.length;i++ ){
            for(int j = 1;j<matrix[i].length;j++){
                matrix[i][j] += matrix[i][j-1];
            }
        }
    }
    public static void prefixsumcolsRows(int [][] matrix){
        for(int j = 0;j<matrix[0].length;j++){
            for(int i=1;i<matrix.length;i++){
                 matrix[i][j]+=matrix[i-1][j];
            }
        }

    }
    public static int sum(int l1,int r1,int l2,int r2,int arr[][]){
        int sum = 0;
        prefixsumrows(arr);
        prefixsumcolsRows(arr);
        System.out.println(Arrays.deepToString(arr));
       sum = arr[l2][r2];
       if(r1>0){
           sum-=arr[l2][r1-1];
       }
       if(l1>0){
           sum-= arr[l1-1][r2];
       }

      if(l1>0&&r1>0){
          sum+=arr[l1-1][r1-1];
      }

       return sum;
    }
}
