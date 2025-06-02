package stack2;

import java.util.Stack;

public class Sum_Of_Subarrays_Minimum {
    public static void main(String[] args) {
int arr[] = {3,1,2,4};
        System.out.println(sumSubarrayMins(arr));
    }
    public static int sumSubarrayMins(int[] arr) {
int size = arr.length;
int nse[] = nse(arr);
int pse[] = pse(arr);
int sum = 0;
int mod = (int) (Math.pow(10,9)+7);
for(int i = 0;i<size;i++){
    int left = i-pse[i];
    int right = nse[i]-i;
    sum = sum+(left*right*arr[i])%mod;
}
return sum;
    }
    public static int[] nse(int arr[]){
        int size = arr.length;
        Stack<Integer> st = new Stack<>();
        int nse[] = new int[size];
        for (int i = size-1 ;i >= 0; i--) {
            while(!st.isEmpty()&&arr[st.peek()]>=arr[i]){
                st.pop();
            }

            if(st.isEmpty()){
                nse[i] = size;
            }
            else{
                nse[i] = st.peek();
            }
            st.push(i);
        }
        return nse;
    }
    public static int[]pse(int arr[]){
        int size = arr.length;
        int pse[] = new int[size];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<size;i++){
            while(!st.isEmpty()&&arr[st.peek()]>arr[i]){
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
}
