package stack2;

import java.util.Stack;

public class SumofSubarrayMinimum {
    public static void main(String[] args) {
int arr[]  = {3,1,2,4};
        System.out.println(sumSubarrayMins(arr));

    }

    public static int sumSubarrayMins(int[] arr) {
//        int nse[]  = findnse(arr);
//        int pse[] = findpse(arr);
//        long total = 0;
//        int mod = (int) (Math.pow(10,9)+7);
//        for (int i = 0; i < arr.length; i++) {
//            total += (long) (i - pse[i]) * (nse[i] - i) % mod * arr[i] % mod;
//             total%= mod;
//        }
//        return (int) Math.abs(total);
//    }
//    public static int [] findnse(int arr[]){
//        int nse[] = new int[arr.length];
//        Stack<Integer> st = new Stack<>();
//        for (int i = arr.length-1; i >=0 ; i--) {
//            while(!st.isEmpty()&&st.peek()>=arr[i]){
//                st.pop();
//            }
//            if (!st.isEmpty()) {
//                nse[i] = st.peek();
//            }
//            st.push(i);
//        }
//        return nse;
//    }
//    public static int [] findpse(int arr[]){
//        int pse[] = new int[arr.length];
//        Stack<Integer> st = new Stack<>();
//        for (int i = 0; i <arr.length ; i++) {
//            while(!st.isEmpty()&&st.peek()>=arr[i]){
//                st.pop();
//            }
//            if (!st.isEmpty()) {
//                pse[i] = st.peek();
//            }
//            st.push(i);
//        }
//        return pse;

        int[] nse = findNSE(arr);
        int[] pse = findPSE(arr);
        long total = 0;
        int mod = (int) (Math.pow(10, 9) + 7);
        for (int i = 0; i < arr.length; i++) {
            long leftRange = (i - pse[i]);
            long rightRange = (nse[i] - i);
            long term = (leftRange * rightRange % mod) * arr[i] % mod;
            total = (total + term) % mod;
        }
        return (int) Math.abs(total);
    }

    public static int[] findNSE(int[] arr) {
        int[] nse = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            nse[i] = (st.isEmpty()) ? arr.length : st.peek();
            st.push(i);
        }
        return nse;
    }

    public static int[] findPSE(int[] arr) {
        int[] pse = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            pse[i] = (st.isEmpty()) ? -1 : st.peek();
            st.push(i);
        }
        return pse;
    }


}
