package stack2;
import java.util.*;
import java.util.Stack;

public class Infix_To_Postfix {
    public static void main(String[] args) {
        String infix  = "a+b*(c^d-e)";
        System.out.println(infixToPostfix(infix));
    }
    public static String infixToPostfix(String exp) {
        int size = exp.length();
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('^',3);
        map.put('*',2);
        map.put('/',2);
        map.put('+',1);
        map.put('-',1);
        map.put('(', 0);

        for(int i = 0;i<size;i++) {
            if (exp.charAt(i) >= 'a' && exp.charAt(i) <= 'z' || exp.charAt(i) >= 'A' && exp.charAt(i) <= 'Z' || exp.charAt(i) >= '0' && exp.charAt(i) <= '9') {
                sb.append(exp.charAt(i));
            } else if (exp.charAt(i) == '(') {
                st.push(exp.charAt(i));
            } else if (exp.charAt(i) == ')') {
                while (st.peek() != '(' && !st.isEmpty()) {
                    sb.append(st.peek());
                    st.pop();
                }
                st.pop();
            } else {
                while (!st.isEmpty() && map.get(exp.charAt(i)) <= map.get(st.peek())) {
                    sb.append(st.pop());
                }
                st.push(exp.charAt(i));
            }

        }
        while(!st.isEmpty()){
            sb.append(st.peek());
            st.pop();
        }
        return sb.toString();
//        int size = exp.length();
//        Stack<Character> st = new Stack<>();
//        stringbuilder sb = new stringbuilder();
//        HashMap<Character,Integer> map = new HashMap<>();
//        map.put('^',3);
//        map.put('*',2);
//        map.put('/',2);
//        map.put('+',1);
//        map.put('-',1);
//        map.put('(', 0); // Add '(' with lowest precedence for handling in stack
//
//        for(int i = 0; i < size; i++) {
//            char currentChar = exp.charAt(i);
//
//            if(Character.isLetterOrDigit(currentChar)) {
//                sb.append(currentChar);
//            } else if(currentChar == '(') {
//                st.push(currentChar);
//            } else if(currentChar == ')') {
//                while(!st.isEmpty() && st.peek() != '(') {
//                    sb.append(st.pop());
//                }
//                st.pop(); // Pop the '(' from the stack
//            } else { // currentChar is an operator
//                while(!st.isEmpty() && map.get(currentChar) <= map.get(st.peek())) {
//                    sb.append(st.pop());
//                }
//                st.push(currentChar);
//            }
//        }
//
//        while(!st.isEmpty()) {
//            sb.append(st.pop());
//        }
//
//        return sb.toString();
    }
}
