package Two_Darrays;

import java.util.Arrays;
import java.util.HashMap;

public class SetMatrixZeroes {
    public static void main(String[] args) {
        int matrix[][] = {{0, 1, 2, 0},
                {3,4,5,2},
                {1,3,1,5}
        };
        setZeroes(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }
    public  static void setZeroes(int[][] matrix) {
        boolean[] rows= new boolean[matrix.length];
        boolean[] cols = new boolean[matrix[0].length];
        for(int i= 0;i<matrix.length;i++){
            for(int j =0;j<matrix[i].length;j++){
                if(matrix[i][j]==0){
                    rows[i]= true;
                    cols[j] = true;
                }
            }
        }
       for(int i = 0;i<rows.length;i++){
           if(rows[i]){
               for(int j = 0;j<matrix[i].length;j++){
                   matrix[i][j] = 0;
               }
           }
       }
       for(int i = 0;i<cols.length;i++){

           if(cols[i]){
               for(int j = 0;j<matrix.length;j++){
                   matrix[j][i] = 0;
               }
           }
       }
    }



}
