package stringPrac;

import java.util.Scanner;
import java.util.Stack;

public class NestingDepth {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println(maxDepth(str));

    }
    public static int maxDepth(String s) {
        Stack<Character> st = new Stack<>();
        int maxx = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == ')'){
                 maxx = Math.max(maxx,st.size());
                st.pop();
            }
            else if(s.charAt(i)=='('){
                st.push(s.charAt(i));
            }
        }
        return maxx;
    }
}
