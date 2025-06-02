package stack2;

import java.util.Stack;

public class sum_of_subarray_Minimum {
    public static void main(String[] args) {
int arr[] = {1,2,3};
        System.out.println(subArrayRanges(arr));
    }
    public static long subArrayRanges(int[] nums) {
long n1 = subarraymin(nums);
long n2 = subarraymax(nums);
        long mod = (long) (Math.pow(10, 9) + 7);
return (n2-n1+mod)%mod;
    }
    public static long subarraymin(int arr[]){
        long total  = 0;
        long mod = (long) (Math.pow(10, 9) + 7);
        int nse[] = findnse(arr);
        int pse[] = findpse(arr);
        for(int i = 0;i<arr.length;i++) {
            int left = i - pse[i];
            int right = nse[i] - i;

            total = (total +(long) left * right*arr[i])%mod;
        }
        return total;
    }
    public static int[] findnse(int arr[]){
        Stack<Integer> st = new Stack<>();
        int nse[] = new int[arr.length];
        for(int i = arr.length-1;i>=0;i--){
            while(!st.isEmpty()&&arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                nse[i] = arr.length;
            }
            else{
                nse[i] = st.peek();
            }
            st.push(i);
        }
        return nse;
    }
    public static int[]findpse(int arr[]){
        Stack<Integer> st = new Stack<>();
        int pse[] = new int[arr.length];
        for(int i = 0;i<arr.length;i++){
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

    public static long subarraymax(int arr[]){
long total = 0;
int nge[] = findnge(arr);
int pge[] = findpge(arr);
        long mod = (long) (Math.pow(10, 9) + 7);
for(int i =0;i<arr.length;i++){
    int left = i-pge[i];
    int right = nge[i] -i;
    total = (total + (long)+left*right*arr[i])%mod;
}
return total;
    }
    public static int[] findnge(int arr[]){
        Stack<Integer> st = new Stack<>();
        int nge[] = new int[arr.length];
        for(int i = arr.length-1;i>=0;i--){
            while(!st.isEmpty()&&arr[st.peek()]<=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                nge[i] = arr.length;
            }
            else{
                nge[i] = st.peek();
            }
            st.push(i);
        }
        return nge;
    }
    public static int[]findpge(int arr[]){
        Stack<Integer> st = new Stack<>();
        int pge[] = new int[arr.length];
        for(int i = 0;i<arr.length;i++){
            while(!st.isEmpty()&&arr[st.peek()]<arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                pge[i] = -1;
            }
            else{
                pge[i] = st.peek();
            }
            st.push(i);
        }
        return pge;
    }
}
