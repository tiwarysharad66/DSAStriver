package twodArrays;

import java.util.Arrays;

public class RotateImg {
    public static void main(String[] args) {
        int matrix[][]={
                {5,1,9,11},
                {2,4,8,10},
                {13,3,6,7},
                {15,14,12,16}
        };
//        transpose(matrix);
rotate(matrix);
    }

    public static  void rotate(int[][] matrix) {
transpose(matrix);
reverse(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }
public static void reverse(int [][]arr){
    int row = arr.length;
    int cols = arr[0].length;
    for(int i = 0;i<row;i++) {
        for (int j = cols-1; j >=cols/2; j--) {
            int temp = arr[i][j];
            arr[i][j] = arr[i][cols-j-1];
            arr[i][cols-j-1] = temp;
        }
    }
}
    public static void transpose(int[][] matrix) {
        int ans[][] = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                ans[i][j] = matrix[j][i];
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = ans[i][j];
            }
        }

    }
}
