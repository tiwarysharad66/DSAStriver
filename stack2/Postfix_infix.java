package stack2;

import java.util.Stack;

public class Postfix_infix {
    public static void main(String[] args) {
String ans = "ab*c+";
        System.out.println(postToInfix(ans));
    }
    static String postToInfix(String exp) {
        int size = exp.length();
        Stack<String> st = new Stack<>();
        for(int i = 0;i<size;i++){
            if (exp.charAt(i) >= 'a' && exp.charAt(i) <= 'z' || exp.charAt(i) >= 'A' && exp.charAt(i) <= 'Z' || exp.charAt(i) >= '0' && exp.charAt(i) <= '9') {
                st.push(String.valueOf(exp.charAt(i)));
            }
            else{
                String s1 = st.peek();
                st.pop();
                String s2 = st.peek();
                st.pop();
                String ans = "(" + s2 + exp.charAt(i)+ s1 +")";
                st.push(ans);
            }
        }
        return st.peek();
    }
}
