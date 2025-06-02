package Recursion_op;

public class Sudoku_solver {
    public static void main(String[] args) {

    }
    public void solveSudoku(char[][] board) {
solve(board);
    }
    boolean solve(char[][]board){
        for(int i = 0;i<board.length;i++){
            for(int j =0;j<board.length;j++){
                if(board[i][j]=='.'){
                    for(char c = '1';c<='9';c++){
                        if(isvalid(board,i,j,c)){
                            board[i][j] = c;
                        }
                        if(solve(board)){
                            return true;

                        } else{
                            board[i][j] = '.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    boolean isvalid(char[][]board,int i,int j,char c){
        for(int l =0 ;l<9;l++){
           if(board[i][l] == c){
               return false;
           }
           if(board[l][j]==c){
               return false;
           }
           if(board[3*(i/3)+l/3][3*(j/3)+l%3]==c){
               return false;
           }
        }
        return true;
    }
}
