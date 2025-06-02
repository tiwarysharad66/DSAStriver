import java.util.ArrayList;
import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
int arr[] = {1,2,3,4,5,6,7};
       rotate(arr,3);
    }
    public static void rotate(int[] nums, int k) {
        int size = nums.length;
        if(size==1){
            return;
        }
        ArrayList<Integer> list =new ArrayList<>();
        if(k>size){
            for(int i =size-(k%size);i<size;i++){
                list.add(nums[i]);
            }
            for(int i=0;i<size-(k%size);i++){
                list.add(nums[i]);
            }
        }
        else{
            for(int i =size-k;i<size;i++){
                list.add(nums[i]);
            }
            for(int i =0;i<=size-k-1;i++){
                list.add(nums[i]);
            }
        }

        int j = 0;
        for(int num:list){
            nums[j++] = num;
        }
        System.out.println(Arrays.toString(nums));
    }
}

