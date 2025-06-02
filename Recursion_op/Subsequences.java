package Recursion_op;

import java.util.ArrayList;
import java.util.List;

public class Subsequences {
    public static void main(String[] args) {
    int arr[] = {3,1,2};
        int idx = 0;
        List<Integer>list = new ArrayList<>();

        System.out.println(subsets(arr));
    }
    public static List<List<Integer>> subsets(int[] nums) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> l= new ArrayList<>();
          subsequences(0,nums,list,l);
          return l;
    }
    static void subsequences(int idx, int arr[], List<Integer>list, List<List<Integer>> l){
        if(idx>=arr.length){
            l.add(new ArrayList<>(list));
            return;
        }
      list.add(arr[idx]);
        subsequences(idx+1,arr,list,l);
        list.removeLast();
        subsequences(idx+1,arr,list,l);

    }
}
