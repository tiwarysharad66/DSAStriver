package stack2;

import java.util.Stack;

public class removeKDigits {
    public static void main(String[] args) {
String num = "1432219";
        System.out.println(removeKdigits(num,3));
    }
    public static String removeKdigits(String num, int k) {
//        int size = num.length();
//        if(k>=size){
//            return "";
//        }
//        Stack<Integer> st = new Stack<>();
//        for (int i = 0; i < size; i++) {
//            while (!st.isEmpty() && Integer.parseInt(String.valueOf(num.charAt(i)))<st.peek()){
//                if(num.charAt(i)=='0'){
//                    break;
//                }
//                st.pop();
//            }
//            st.push(Integer.parseInt(String.valueOf(num.charAt(i))));
//        }
//        if(st.isEmpty()){
//            return num.substring(k,size);
//        }
//        String s = "";
//        while(!st.isEmpty()){
//            s= s+st.pop();
//        }
//        return s;
        int size = num.length();
        if(k>=size){
            return "0";
        }
        Stack<Character> st = new Stack<>();
        for(int i = 0;i<size;i++) {
            while (k > 0 && !st.isEmpty() && num.charAt(i) < st.peek()) {
                k--;
                st.pop();
            }
            st.push(num.charAt(i));
        }
        while (k > 0) {
            st.pop();
            k--;
        }
            StringBuilder sb = new StringBuilder();
        if(st.isEmpty()){
            sb.append(num.substring(k,size));
            return sb.toString();
        }
            while(!st.isEmpty()){
                sb.append(st.pop());
            }
            sb.reverse();
            String s = "";
//        String result = sb.toString().replaceAll("^0+", "");
//
//        return result.isEmpty() ? "0" : result;
//            int j = 0;
//          for(int i = 0;i<sb.length();i++){
//              if(sb.charAt(i)!='0'){
//                  s.append(sb.substring(i+1,sb.length()));
//              }
//          }
        for(int i = 0;i<sb.length();i++){
            if(sb.charAt(i)!='0'){
                s = s+sb.substring(i,sb.length());
                break;
            }
        }

return s;
    }
}
