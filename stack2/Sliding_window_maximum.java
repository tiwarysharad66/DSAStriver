package stack2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Sliding_window_maximum {
    public static void main(String[] args) {
int arr[] = {1,3,1,2,0,5};
        System.out.println(Arrays.toString(maxSlidingWindow(arr, 3)));
    }
    public static int[] maxSlidingWindow(int[] nums, int k) {
int size = nums.length;
        Stack<Integer> st = new Stack<>();
        if(k==1){
            return nums;
        }
        int i = 0;
        int j = 0;
        boolean flag = false;
//        int max[] = new int[size];
        ArrayList<Integer> list = new ArrayList<>();

        while(j<size){
//            if(!st.isEmpty()&&st.peek()<=nums[j]){
//                st.pop();
//            }
            while(!st.isEmpty()&&nums[j]>=st.peek()){
                st.pop();
            }
//            st.push(nums[j]);
            if(st.isEmpty()){
                st.push(nums[j]);
            }
            if(j-i+1==k) {
                list.add(st.peek());
                if (nums[i] == st.peek()) {
                    st.pop();
                    st.push(nums[j]);
                }
                i++;
            }
    j++;

        }
  int max[] = new int[list.size()];
        int l = 0;
        for(int num:list){
            max[l++] = num;
        }
return max;
    }
}
