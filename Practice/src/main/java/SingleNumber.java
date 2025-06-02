import java.util.HashMap;

public class SingleNumber {
    public static void main(String[] args) {
         int arr[] = {1,2,3,4,};
    }
    public int singleNumber(int[] nums) {
int size = nums.length;
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i =0;i<size;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
       for(int key:mp.keySet()){
           if(mp.get(key)==1){
               return key;
           }
        }
       return -1;
    }
}
