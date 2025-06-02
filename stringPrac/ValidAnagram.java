package stringPrac;

import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class ValidAnagram {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String t = s.nextLine();
        System.out.println(isAnagram(str,t));
    }
    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> h = new HashMap<>();
        HashMap<Character,Integer> h2 = new HashMap<>();
        for(int i=0;i<s.length();i++){
            h.put(s.charAt(i),h.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<t.length();i++){
            h2.put(t.charAt(i),h2.getOrDefault(t.charAt(i),0)+1);
        }
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
          if(!Objects.equals(h.get(c), h2.get(c))){
              return false;
          }
        }
        return true;
    }
}
