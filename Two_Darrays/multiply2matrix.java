package Two_Darrays;

import java.util.Arrays;

public class multiply2matrix {
    public static void main(String[] args) {
int arr1[][] = {
        { 1,2,1},
        { 3,1,2}};
        int arr2[][] = {
                { 1,2},
                {4,5},
                { 4,4},
        };
        System.out.println(Arrays.deepToString(multiply(arr1, arr2, 2, 3, 3, 2)));

    }
    public static int[][] multiply(int arr[][],int arr2[][],int r1,int c1,int r2,int c2){
       if(c1!=r2){
           return new int[][]{{0}};
       }
int mul[][] = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                    for(int l = 0;l<c1;l++){
                        mul[i][j] +=(arr[i][l]*arr2[l][j]);
                    }
            }
        }
        return  mul;
    }
}
