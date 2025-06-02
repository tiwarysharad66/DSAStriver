package Recursion_op;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Nqueen {
    static boolean issafe(int row,int col,char[][]board) {
        int duprow = row;
        int dupcol = col;
        while (row >= 0 && col >= 0) {
            if (board[row][col] == 'Q') return false;
            row--;
            col--;
        }
        row = duprow;
        col = dupcol;
        while (col >= 0) {
            if (board[row][col] == 'Q') return false;
            col--;
        }
        row = duprow;
        col = dupcol;
        while(row<board.length&&col>=0) {
            if(board[row][col]=='Q') return false;
            row++;
            col--;
        }
return true;
    }
    static void ans(int col,char[][]board,List<List<String>> ans) {
        if (col == board.length) {
            ans.add(construct(board));
            return;
        }
        for(int row = 0;row<board.length;row++) {
            if(issafe(row,col,board)) {
                board[row][col] = 'Q';
                ans(col+1,board,ans);
                board[row][col] = '.';
            }
        }

    }
    static List<String>construct(char[][]board) {
List<String>l = new ArrayList<>();
for(int i = 0;i<board.length;i++) {
   l.add(new String(board[i]));
}
return l;
    }
//    public static void main(String[] args) {
//
//    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans  = new ArrayList<>();
        char [][]board = new char[n][n];
ans(0,board,ans);
        return ans;
    }
}

