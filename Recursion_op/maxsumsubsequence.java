package Recursion_op;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class maxsumsubsequence {
    public static void main(String[] args) {
int nums[] = {2,1,3,3};
        System.out.println(Arrays.toString(maxSubsequence(nums,2)));
    }

    public static int []maxSubsequence(int[] nums, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        subsequences(0, nums, new ArrayList<>(), 0, k, Integer.MIN_VALUE, ans);

        // Find the maximum sum subsequence of length k in ans
        int maxSum = Integer.MIN_VALUE;
        List<Integer> result = null;
        for (List<Integer> list : ans) {
            int sum = 0;
            for (int num : list) {
                sum += num;
            }
            if (sum > maxSum) {
                maxSum = sum;
                result = list;
            }
        }
        int i =0;
        int arr[]= new int[result.size()];
                for(int e:result){
                    arr[i++] =e;
                }

        return arr;
    }


    static void subsequences(int i, int[] arr, List<Integer> list, int sum, int length, int max, List<List<Integer>> ans) {
        if (list.size() == length) {
            ans.add(new ArrayList<>(list)); // Add a copy of list to ans
            return;
        }

        if (i == arr.length) {
            return;
        }

        // Choose current element and recurse
        list.add(arr[i]);
        sum += arr[i];
        subsequences(i + 1, arr, list, sum, length, max, ans);

        // Backtrack
        list.remove(list.size() - 1);
        sum -= arr[i];

        // Skip current element and recurse
        subsequences(i + 1, arr, list, sum, length, max, ans);
    }

}
