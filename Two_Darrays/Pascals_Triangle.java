package Two_Darrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Pascals_Triangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int rows = s.nextInt();

        System.out.println(generate(rows));  ;

    }
    public static  List<List<Integer>> generate(int rows){
        List<List<Integer>> list = new ArrayList<>();
        int arr[][] = new int[rows][];
        for(int i = 0;i<rows;i++){
            arr[i] = new int[i+1];
            arr[i][0] = 1;
            arr[i][i] = 1;
            for(int j =1;j<i;j++){
                arr[i][j] = arr[i-1][j]+ arr[i-1][j-1];
            }

        }
        for(int num[]:arr){
            List<Integer> listt = new ArrayList<>();
            for(int i = 0;i<num.length;i++){
                listt.add(num[i]);
            }
            list.add(listt);

        }
return list;
    }

}
