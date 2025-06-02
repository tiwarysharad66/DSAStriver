package Two_Darrays;

import java.util.Arrays;
import java.util.Scanner;

public class arrayInitialise {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int row = s.nextInt();
        int cols = s.nextInt();
        int [][] arr = new int[row][cols];
        for(int i = 0;i<arr.length;i++){
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        print2d(arr);
        int arr2[][] = {{1,2,3,4},
                {5,6,7,8},
                {10,1,1,2}};
        for(int i = 0;i<arr2.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void print2d(int [][]arr){
        for(int i = 0;i<arr.length;i++){
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("row"+ i + "cols" +j +","+  (arr[i][j]));
            }
            System.out.println();
        }
    }
}
