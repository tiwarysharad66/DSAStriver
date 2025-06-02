import java.util.Arrays;
import java.util.HashMap;

public class Sum_2 {
    public static void main(String[] args) {
        int arr[] = {3,3};
        System.out.println(Arrays.toString(twoSum(arr,6)));
    }
    public static  int[] twoSum(int[] nums, int target) {
int size= nums.length;
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i=0;i<size;i++){
            if(!h.containsKey(nums[i])){
                h.put(nums[i],i);
            }

        }
        for(int i=0;i<size;i++){
            if(h.containsKey(target-nums[i])){
                return new int[]{i,h.get(target-nums[i])};
            }
        }
        return new int[]{0,0};
    }
}
