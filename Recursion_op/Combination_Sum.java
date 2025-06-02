package Recursion_op;

import java.util.*;

public class Combination_Sum {
    public static void main(String[] args) {
        int arr[] = {10,1,2,7,6,1,5};
        List<List<Integer>>ans = new ArrayList<>();
        System.out.println(combinationSum(arr,8));
    }
    public static  List<List<Integer>> combinationSum(int[] candidates, int target) {
List<List<Integer>> ans = new ArrayList<>();
//Arrays.sort(candidates);
//combination(0,candidates,target,new ArrayList<>(),ans);
        return new ArrayList<>(ans);
    }
    static void combination(int index,int arr[],int target, List<Integer> list,Set<List<Integer>> ans,int k){
     if(index==arr.length) {
         if (target == 0&&list.size()==k) {
             ans.add(new ArrayList<>(list));
         }
             return ;
     }

         if(arr[index]<=target){
             list.add(arr[index]);
             combination(index+1,arr,target-arr[index],list,ans,k);
             list.removeLast();
         }
         combination(index+1,arr,target,list,ans,k);


    }


}
