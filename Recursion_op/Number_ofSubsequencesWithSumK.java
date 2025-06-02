package Recursion_op;

import java.util.ArrayList;
import java.util.List;

public class Number_ofSubsequencesWithSumK {
    public static void main(String[] args) {
        int arr[] = {1,2,1};
subsequences(0,arr,new ArrayList<>(),0,2);
    }
    static void subsequences(int i, int arr[], List<Integer> list,int sum,int target){
        if(i==arr.length) {
            if (sum == target) {
                System.out.println(list);
            }
            return;
        }
        list.add(arr[i]);
        sum+=arr[i];
        subsequences(i+1,arr,list,sum,target);
        list.removeLast();
        sum = sum-arr[i];
        subsequences(i+1,arr,list,sum,target);

        }

}
