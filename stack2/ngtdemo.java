package stack2;

import java.util.Arrays;
import java.util.Stack;

public class ngtdemo {
    public static void main(String[] args) {
        int arr[] = {1,3,4,2};
        System.out.println(Arrays.toString(ngt(arr)));
    }
    public static int[] ngt(int arr[]){
        int size = arr.length;
        int count = 0;
        Stack<Integer>st = new Stack<>();
        int newarr[] = new int[size];
       for(int i = size-1;i>=0;i--){
           while(!st.isEmpty()&&st.peek()<arr[i]){
               st.pop();
           }
           if(st.isEmpty()){
               newarr[i] = -1;
           }
           else{
               count++;
               newarr[i] = st.peek();
           }
           st.push(arr[i]);
       }
       return newarr;
    }
}
