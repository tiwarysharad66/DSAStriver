package twodArrays;

import javax.imageio.ImageTranscoder;
import java.util.Scanner;

public class Formation {
    public static String search(int arr[][] ,int key) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == key) {
                    return "found";
                }
            }
        }
            return "not found";

}
        public static void main (String[]args){
            int[][] matrix = new int[3][3];
            Scanner s = new Scanner(System.in);
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = s.nextInt();
                }
            }
            for (int a[] : matrix) {
                for (int x : a) {
                    System.out.print(x + " ");
                }
                System.out.println();
            }
            String str = search(matrix,5);
            System.out.println(str);
        }


    }

