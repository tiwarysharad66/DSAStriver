import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class rotatearray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(rotate(arr,3)));
    }
    public static int[] rotate(int nums[],int k) {
        int size = nums.length;
        List<Integer> list = new ArrayList<>();
        k = k % size;
       for(int i=size-k;i<size;i++){
           list.add(nums[i]);
       }
       int newarr[] = new int[size];
       int j = 0;
       for(int num:list){
           newarr[j++] = num;
       }
       for(int i=0;i<size-k;i++){
           newarr[j++] = nums[i];
       }
       for(int i=0;i<size;i++){
           nums[i] = newarr[i];
       }
       return nums;
    }
}
