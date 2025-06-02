package stack2;
import javax.security.auth.callback.CallbackHandler;
import java.util.Stack;
import java.util.ArrayList;
public class Valid_Parantehsis {
    public static void main(String[] args) {
String s = "()[{}()]";
        System.out.println(isValid(s));
    }
    public static boolean isValid(String s) {
int size = s.length();
//this code wont work if the order of brackets changed :)
//Stack<Character> st = new Stack<>();
//for(int i = 0;i<size;i++){
//    if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{'){
//        st.push(s.charAt(i));
//    }
//}
//boolean flag = false;
//for(int i=0;i<size;i++){
//    if(st.peek()=='('&&s.charAt(i)==')'){
//        st.pop();
//        flag = true;
//    }
//    else if(st.peek()=='['&&s.charAt(i)==']'){
//        flag = true;
//        st.pop();
//    }
//    else if(st.peek()=='{'&&s.charAt(i)=='}'){
//        flag = true;
//        st.pop();
//    }
//
//}
//if(flag){
//    return true;
//}
//return false;
        Stack<Character> st = new Stack<>();
        for(int i = 0;i<size;i++){
            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
                st.push(s.charAt(i));
            }
            else if(s.charAt(i)==')'&&st.peek()=='('||s.charAt(i)==']'&&st.peek()=='['||s.charAt(i)=='}'&&st.peek()=='{'){
                st.pop();
            }
            else{
                return false;
            }
        }
        return true;
    }
}
