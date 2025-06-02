package Two_Darrays;

import java.util.Arrays;

public class Reverse2Darray {
    public static void main(String[] args) {
int matrix[][]= {{1,2,3},
        {4,5,6}};
reverse(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }
    public  static void reverse(int [][ ] arr){
        int row = arr.length;
        int cols = arr[0].length;
        for(int i = 0;i<row;i++) {
            for (int j = cols-1; j >cols/2; j--) {
                int temp = arr[i][j];
                 arr[i][j] = arr[i][cols-j-1];
                arr[i][cols-j-1] = temp;
            }
        }
    }
}
