package Two_Darrays;

import java.util.Scanner;

public class SumOfRectangleBruteForce {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int r = s.nextInt();
        int c = s.nextInt();
        int[][] matrix = new int[r][c];
        for (int i = 0; i <r ; i++) {
            for (int j = 0; j <c ; j++) {
                matrix[i][j] = s.nextInt();
            }
        }
        int l1 = s.nextInt();
        int l2 = s.nextInt();
        int r1 = s.nextInt();
        int r2 = s.nextInt();
        System.out.println(sum(3,1,5,4,matrix));

    }
    public static int sum(int l1,int r1,int l2,int r2,int arr[][]){
        int sum =0;
        for(int i =l1;i<=l2;i++){
            for(int j = r1;j<=r2;j++){
                sum+=arr[i][j];
            }
        }
        return sum;
    }
}
