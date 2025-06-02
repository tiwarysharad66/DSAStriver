package Two_Darrays;

import leetcode.Hackerank;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
int matrix[][] = {
        {1,2,3,4},
        {5,6,7,8},
        {9,10,11,12}
};
        System.out.println(spiral(matrix));
    }
    public static List<Integer> spiral(int [][] arr) {
        int trow = 0;
        int brow = arr.length - 1;
        int lcol = 0;
        int rcol = arr[0].length - 1;
        int totalelements=0;
        List<Integer> list = new ArrayList<>();
        while (totalelements< arr.length*arr[0].length) {
            //top row -> left col to right col
            for (int i = lcol; i <= rcol; i++) {
                list.add(arr[trow][i]);
                totalelements++;
            }
            //right col->    //top row to bottom row
            trow++;
            if(totalelements>=arr.length*arr[0].length){
                break;
            }
            for (int i = trow; i <= brow; i++) {
                list.add(arr[i][rcol]);
                totalelements++;
            }
            if(totalelements>=arr.length*arr[0].length){
                break;
            }
            rcol--;
            //bottomrow->//right col to left col
            if(totalelements>=arr.length*arr[0].length){
                break;
            }
            for (int i = rcol; i >= lcol; i--) {
                list.add(arr[brow][i]);
                totalelements++;
            }
            if(totalelements>=arr.length*arr[0].length){
                break;
            }
            //bottom row to top row
            brow--;
            for (int i = brow; i >= trow; i--) {
                list.add(arr[i][lcol]);
                totalelements++;
            }
//            trow++;
//            rcol--;
            lcol++;
//            brow--;
        }

     return list;
    }

}
