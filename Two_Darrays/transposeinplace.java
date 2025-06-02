package Two_Darrays;

import java.util.Arrays;
import java.util.Scanner;

public class transposeinplace {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int row = s.nextInt();
        int col = s.nextInt();
        int[][] arr = new int[row][col];
        for(int i = 0;i<row;i++){
            for(int j = 0;j<col;j++){
                arr[i][j] = s.nextInt();
            }
        }
        transpose(arr,row,col);
        System.out.println(Arrays.deepToString(arr));
    }
    public static void transpose(int [][]matrix,int r,int c){
        for(int i = 0;i<r;i++){
            for(int j = i;j<c;j++) {
//                if (j>i) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
//                }
            }
        }
    }
}
