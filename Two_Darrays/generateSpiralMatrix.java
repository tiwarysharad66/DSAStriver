package Two_Darrays;

import java.util.Arrays;
import java.util.Scanner;

public class generateSpiralMatrix {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(Arrays.deepToString(matrix(n)));
    }
    public static int[][] matrix(int n){
        int arr[][] = new int[n][n];
        int trow = 0;
        int brow = arr.length - 1;
        int lcol = 0;
        int rcol = arr[0].length - 1;
        int totalelements=0;
        int p = 1;
        //we can also 
        while(totalelements<(arr.length*arr[0].length)){
            for(int i = lcol;i<=rcol;i++){
                      arr[trow][i] = p++;
                      totalelements++;
            }
            trow++;
            boolean b = totalelements > arr.length * arr[0].length;
            if(b){
                break;
            }
            for(int i = trow;i<=brow;i++){
                arr[i][rcol] = p++;
                totalelements++;
            }

            if(b){
                break;
            }
            rcol--;
            for(int i = rcol;i>=lcol;i--){
                arr[brow][i] = p++;
                totalelements++;
            }
            brow--;
            if(b){
                break;
            }
            for(int i = brow;i>=trow;i--){
                arr[i][lcol] = p++;
                totalelements++;
            }
            lcol++;
        }
        return arr;
    }
}
