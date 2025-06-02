package stack2;

import java.util.Stack;

public class Prefix_infix {
    public static void main(String[] args) {
     String s = "*-A/BC-/AKL";
        System.out.println(preToInfix(s));
    }
    static String preToInfix(String pre_exp) {
        int size = pre_exp.length();
        Stack<String> st = new Stack<>();
        for(int i=size-1;i>=0;i--){
            if (pre_exp.charAt(i) >= 'a' && pre_exp.charAt(i) <= 'z' || pre_exp.charAt(i) >= 'A' && pre_exp.charAt(i) <= 'Z' || pre_exp.charAt(i) >= '0' && pre_exp.charAt(i) <= '9') {
                st.push(String.valueOf(pre_exp.charAt(i)));
            }
            else{
                String s1 = st.peek();
                st.pop();
                String s2= st.peek();
                st.pop();
                String ans = "(" + s1 + pre_exp.charAt(i) + s2 + ")";
                st.push(ans);
            }
        }
        return st.peek();
    }
}
