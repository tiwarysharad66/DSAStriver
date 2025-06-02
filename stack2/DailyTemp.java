package stack2;

import java.util.Arrays;
import java.util.Stack;

public class DailyTemp {
    public static void main(String[] args) {
int arr[] = {73,74,75,71,69,72,76,73};
        System.out.println(Arrays.toString(dailyTemperatures(arr)));
    }
    public static int[] dailyTemperatures(int[] temperatures) {
      int ngi[] = findngi(temperatures);
      int ans[] = new int[temperatures.length];
      for(int i = 0;i<temperatures.length;i++){
          if(ngi[i]!=-1){
              ans[i] = ngi[i]-i;
          }
          else{
              ans[i] = 0;
          }
      }
      return ans;
     }
    public static int[] findngi(int arr[]){
        int size=  arr.length;
        int[] ans = new int[size];
        Stack<Integer> st = new Stack<>();
        for(int i = size-1;i>=0;i--){
            while(!st.isEmpty()&&arr[st.peek()]<=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i] = -1;
            }
            else{
                ans[i] = st.peek();
            }
            st.push(i);
        }
        return ans;
    }
}
