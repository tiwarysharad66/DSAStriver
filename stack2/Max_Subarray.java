package stack2;

import java.util.*;
import java.util.Stack;

public class Max_Subarray {
    public static void main(String[] args) {
int arr[] = {1,3,-1,-3,5,3,6,7};
        System.out.println(Arrays.toString(maxSlidingWindow(arr,3)));
    }
    public static int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> u = new ArrayDeque<>();
        ArrayList<Integer>list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (!u.isEmpty() && u.peekFirst() <= i - k) {
                u.pollFirst();
            }
            while (!u.isEmpty() && nums[u.peekLast()] <= nums[i]) {
                u.pollLast();
            }
            u.offerLast(i);
            if (i >= k - 1) {
                list.add(nums[u.peekFirst()]);
            }
        }
            int l = 0;
            int arr[] = new int[list.size()];
            for(int num:list){
                arr[l++] = num;
            }
          return arr;
        }
    }

