package twodArrays;
class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=mat[i][i];
            if(i!=n-1-i){
                sum+=mat[i][n-i-1];
            }
        }
        //brute force
        // for(int i=0;i<mat.length;i++){
        //     for(int j=0;j<mat[i].length;j++){
        //         if(i==j){
        //             sum+=mat[i][j];
        //         }
        //         else if(i+j==n-1){
        //             sum+=mat[i][j];
        //         }
        //     }
        // }
        return sum;
    }
}
