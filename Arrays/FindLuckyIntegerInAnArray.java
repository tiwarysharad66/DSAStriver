package Arrays;

import java.util.HashMap;

public class FindLuckyIntegerInAnArray {
    public static void main(String[] args) {

    }
    public static int findLucky(int[] arr) {
  int size = arr.length;
  int ans = -1;
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i=0;i<size;i++){
            h.put(arr[i],h.getOrDefault(arr[i],0)+1);
        }
        for(int num:arr){
            if(h.get(num)==num){
                ans = Math.max(ans,num);

            }
        }
        return ans;
    }
}
