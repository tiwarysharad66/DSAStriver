package stack2;

import java.util.ArrayList;
import java.util.Stack;

public class Prev_Smaller {
    public static void main(String[] args) {
ArrayList<Integer> list = new ArrayList<>();
list.add(39);
list.add(27);
list.add(4);
list.add(24);
list.add(32);
list.add(32);
list.add(1);
        System.out.println(prevSmaller(list));
    }
    public static ArrayList<Integer> prevSmaller(ArrayList<Integer> A) {
        int[] arr = new int[A.size()];
        int size = A.size();
       for(int i = 0;i<size;i++){
           arr[i] = A.get(i);
       }
       int newarr[] = new int[size];
        Stack<Integer> st = new Stack<>();
       for(int i = 0;i<arr.length;i++){
           while(!st.isEmpty()&&st.peek()>=arr[i]){
               st.pop();
           }
           if(st.isEmpty()){
               newarr[i] = -1;
           }
           else if(st.peek()<arr[i]){
               newarr[i] = st.peek();
           }
           st.push(arr[i]);
       }
       ArrayList<Integer> list = new ArrayList<>();
       for(int num:newarr){
           list.add(num);
       }
       return list;
    }

}
