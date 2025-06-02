package BinarySearch;

import java.util.HashMap;
import java.util.Map;

public class SingleElementSortedarray {
    public static void main(String[] args) {
int arr[] = {1,1,2,3,3,4,4,8,8};
        System.out.println(singleNonDuplicate(arr));
    }
    public static int singleNonDuplicate(int[] nums) {
        int size = nums.length;
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i = 0;i<size;i++){
           mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        int ans =0;
      for(int key:mp.keySet()){
          if(mp.get(key)==1){
              ans = key;
          }
      }
      return ans;
    }
}
