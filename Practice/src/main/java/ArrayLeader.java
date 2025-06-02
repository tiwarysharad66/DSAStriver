import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class ArrayLeader {
    public static void main(String[] args) {
        int arr[] = {16,17,4,3,5,2};
        System.out.println(leaders(arr));
    }
    static ArrayList<Integer> leaders(int arr[]) {
        int idx[] = new int[arr.length];
for(int i = 0;i<arr.length;i++){
    int e = i;
    boolean f = nge(e,arr);
    if(f){
        idx[i] = 1;
    }
    else{
        idx[i] =0;
    }

}
        ArrayList<Integer> list = new ArrayList<>();
for(int i =0;i<idx.length;i++){
    if(idx[i]==1){
        list.add(arr[i]);
    }
}
return list;

    }
    static boolean nge(int e,int arr[]){
        Stack<Integer> st  =new Stack<>();
//        for(int i=e;i<arr.length;i++){
//            while(!st.isEmpty()&&st.peek()<=arr[i]){
//                st.pop();
//                break;
//
//            }
//            st.add(arr[i]);
//        }
//        return st.peek() == e;
        for(int i = e+1;i<arr.length;i++){
            if(arr[i]>=arr[e]){
                return false;
            }
        }
        return true;
    }

}
