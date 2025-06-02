package stack2;

import java.util.Arrays;
import java.util.Stack;

public class ngt2 {
    public static void main(String[] args) {
int arr[] = {1,2,1};
        System.out.println(Arrays.toString(nextGreaterElements(arr)));
    }
    public static  int[] nextGreaterElements(int[] nums) {
int size= nums.length;
        Stack<Integer> st = new Stack<>();
        int newarr[] = new int[size];
        int i = size-1;
        while(i>=0){
            st.push(nums[i%size]);
            i--;
        }
for(int j =size-1;j>=0;j--){
    while(!st.isEmpty()&&st.peek()<=nums[j]){
        st.pop();
    }
    if(st.isEmpty()){
        newarr[j] = -1;
    }
    else{
        newarr[j] = st.peek();
    }
    st.push(nums[j]);
}
return newarr;
    }
}
