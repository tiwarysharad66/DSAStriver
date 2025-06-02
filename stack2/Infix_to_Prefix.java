package stack2;

import java.util.Arrays;
import java.util.Stack;

//public class Infix_to_Prefix {
//    public static void main(String[] args) {
//
//    }
//    public static String infix(String str){
//        int size=  str.length();
//        str = reverse(str);
// stringbuilder sb = new stringbuilder(str);
// String ans = "";
//        Stack<Character> st = new Stack<>();
// for(int i = 0;i<sb.length();i++){
//     if(str.charAt(i)>='a'&&str.charAt(i)<='z'||str.charAt(i)>='A'&&str.charAt(i)<='Z'|| str.charAt(i)>='0'||str.charAt(i)<='9'){
//         ans+=str.charAt(i);
//     }
//     else if (str.charAt(i) == '(') {
//         st.push(str.charAt(i));
//     } else if (str.charAt(i) == ')') {
//         while (st.peek() != '(' && !st.isEmpty()) {
//             sb.append(st.peek());
//             st.pop();
//         }
//         st.pop();
//     }
//     return
// }

//    }
//    public static String reverse(String str){
//        int start = 0;
//        int end=  str.length()-1;
//     char arr[] = str.toCharArray();
//     while(start<=end){
//         char temp = arr[start];
//         arr[start] =arr[end];
//         arr[end] = temp;
//         start++;
//         end--;
//     }
//    return Arrays.toString(arr);
//    }
//}
