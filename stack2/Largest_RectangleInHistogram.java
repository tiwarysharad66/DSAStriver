package stack2;

import java.util.Stack;

public class Largest_RectangleInHistogram {
    public static void main(String[] args) {
int arr[] = {2,1,5,6,2,3};
        System.out.println(largestRectangleArea(arr));
    }
    public static int largestRectangleArea(int[] heights) {
int size = heights.length;
int nsi[] = nse(heights);
int psi[] = pse(heights);
int area=  0;
int max = Integer.MIN_VALUE;
for(int i = 0;i<size;i++){
area = heights[i]*(nsi[i]-psi[i]-1);
max = Math.max(max,area);
}
return max;
    }
    public static int[] pse(int arr[]){
        int size = arr.length;
        Stack<Integer> st = new Stack<>();
        int pse[] = new int[size];
        for(int i =0;i<size;i++){
            while(!st.isEmpty()&&arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                pse[i] = -1;
            }
            else{
                pse[i] = st.peek();
            }
            st.push(i);
        }
        return pse;
    }
    public static int[]nse(int arr[]){
        int size= arr.length;
        Stack<Integer> st = new Stack<>();
        int[]nse = new int[size];
        for(int i=size-1;i>=0;i--) {
            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                nse[i] = size;
            }
            else{
                nse[i] = st.peek();
            }
            st.push(i);
        }
        return nse;
    }
}
