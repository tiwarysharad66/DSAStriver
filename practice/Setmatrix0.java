package practice;

import java.util.Arrays;

public class Setmatrix0 {
    public static void main(String[] args) {
        int matrix[][] = {
                {1,1,1} ,
                {1,0,1},
                { 1,1,1}
        };
       setZeroes(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }
    public static void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int cols = matrix[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                     set(matrix,i,j);
                }
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }
public static void set(int [][]matrix,int i,int j){
        for(int l = 0;l<matrix[0].length;l++){
            matrix[i][l]=0;
        }
        for(int k = 0;k<matrix.length;k++){
            matrix[k][j] = 0;
        }
    }
}
