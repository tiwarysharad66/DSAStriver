package slidingwndow;


import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;


public class MaxOfAllSubarraysOfSizeK {
    public static void main(String[] args) {
maxSlidingWindow(new int[]{9,11},2);

    }
    public static void maxSlidingWindow(int[] nums, int k) {
           int size = nums.length;
           int i = 0;
//        List<Integer> l =  new LinkedList<>();
        Deque<Integer> l = new LinkedList<>();
        List<Integer> ans = new ArrayList<>();
        //can use list and deque
           int j = 0;
           while(j<size){
               while(!l.isEmpty()&&l.getLast()<nums[j]){
                   l.removeLast();
               }
               l.addLast(nums[j]);
               if(j-i+1<k){
                   j++;
               }
               else if(j-i+1==k){
                   ans.add(l.getFirst());
                   if(nums[i]==l.getFirst()){
                       l.removeFirst();
                   }
                   i++;
                   j++;
               }
           }
        int a[] = new int[ans.size()];
        int o = 0;
        for(int p :ans){
            a[o++] = p;
        }
//        return a;
        System.out.println(ans);
    }
}
