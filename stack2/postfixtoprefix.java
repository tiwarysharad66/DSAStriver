package stack2;

import java.util.Stack;

public class postfixtoprefix {
    public static void main(String[] args) {
       String str = "ABC/-AK/L-*";
        System.out.println(postToPre(str));
    }
    static String postToPre(String post_exp) {
//        int n = post_exp.length();
//        Stack<String>st = new Stack<>();
//        for(int i=0;i<n;i++){
//            if(post_exp.charAt(i)>='a'&&post_exp.charAt(i)<='z'||post_exp.charAt(i)>='A'&&post_exp.charAt(i)<='Z'||post_exp.charAt(i)>='0'&&post_exp.charAt(i)<='9'){
//                st.push(String.valueOf(post_exp.charAt(i)));
//            }
//            else {
//                String t1 = st.peek();
//                st.pop();
//                String t2 = st.peek();
//                st.pop();
//          String ans = post_exp.charAt(i)+t2+t1;
//
//            }
//        }
//        return st.peek();
        Stack<String> stack = new Stack<>();

        // Traverse the postfix expression
        for (int i = 0; i < post_exp.length(); i++) {
            char c = post_exp.charAt(i);

            if (isOperand(c)) {
                stack.push(String.valueOf(c));
            } else if (isOperator(c)) {
                String operand1 = stack.pop();
                String operand2 = stack.pop();
                String result = c + operand2 + operand1; // Create prefix expression
                stack.push(result);
            }
        }

        return stack.pop(); // Final prefix expression
    }

    static boolean isOperand(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9');
    }

    static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';

    }
}
