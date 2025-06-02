package stringPrac;

import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class IsmorphicString {
    public static void main(String[] args) {
Scanner s = new Scanner(System.in);
String s1 = s.nextLine();
String s2 = s.nextLine();
        System.out.println(isIsomorphic(s1,s2));
    }
    public static boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Character> h = new HashMap<>();
        HashMap<Character,Character> h2 = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            if(h.containsKey(s.charAt(i))){
                if(!h.containsValue(t.charAt(i))){
                    return false;
                }
            }
            if(h2.containsKey(t.charAt(i))){
                if(!h2.containsValue(s.charAt(i))){
                    return false;
                }
            }
                h.put(s.charAt(i),t.charAt(i));
            h2.put(t.charAt(i),s.charAt(i));
        }
        return true;
    }
//paper
    //title
}
