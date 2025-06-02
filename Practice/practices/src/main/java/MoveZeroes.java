import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
int arr[] = {0,1,0,3,12};
        System.out.println(Arrays.toString(zeroes(arr)));
    }
    public static int [] zeroes(int []nums){
        int size = nums.length;
        int j = 0;
        for(int i = 0;i<size;i++){
            if(nums[i]==0){
                continue;
            }
            else{
                nums[j++] = nums[i];
            }
        }
        for(int i=j;i<size;i++){
            nums[i]=0;
        }
        return nums;
    }
}
