package stack2;

import java.util.Stack;

public class prefix_to_postfix {
    public static void main(String[] args) {
String str = "*-A/BC-/AKL";
        System.out.println(preToPost(str));
    }
    static String preToPost(String pre_exp) {
        int n = pre_exp.length();
      Stack<String> st = new Stack<>();
        for(int i= n-1;i>=0;i--){
            char c = pre_exp.charAt(i);
            if(isOperand(c)){
                st.push(String.valueOf(pre_exp.charAt(i)));
            }
            else if(isOperator(c)){
                String s1 = st.pop();
                String s2 = st.pop();
                st.push(s1+s2+pre_exp.charAt(i));
            }
        }
        return st.pop();

    }

    static boolean isOperand(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9');
    }
        static boolean isOperator(char c) {
            return c == '+' || c == '-' || c == '*' || c == '/';
        }

}
