package stringPrac;

import java.util.Scanner;
import java.util.Stack;

public class Remove_Outermost_Paranthesis {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println(removeOuterParentheses(str));
    }
    public static String removeOuterParentheses(String s) {
        int start = 0;
        int count = 0;
        StringBuilder ans = new StringBuilder();
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)=='('){
                count++;
            }
            else{
                count--;
            }
            if(count==0){
                ans.append(s.substring(start + 1, i));
                start = i+1;
            }
        }
    return ans.toString();
    }
}
