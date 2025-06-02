import java.util.Arrays;

public class linearsearch2darray {
    public static void main(String[] args) {
        int[][] arr = {
                {13,32,34},
        {12,55},
        {42,44,41,33},
                {212,2,1,553,422},
        };
        int target  = 212;
        int ans[] = linearsearch(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int [] linearsearch(int[][] arr, int target){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==target){
                    return new int[]{i,j};
                }
            }
        }
return new int[]{-1};
    }
}
