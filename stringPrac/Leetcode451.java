package stringPrac;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Leetcode451 {
    public static void main(String[] args) {
    String s = "tree";
        System.out.println(frequencySort(s));
    }
    public static String frequencySort(String s) {
      int len  = s.length();
        HashMap<Character,Integer> h = new HashMap<>();
        for(int i = 0;i<len;i++){
            h.put(s.charAt(i),h.getOrDefault(s.charAt(i),0)+1);
        }
        List<Character> list = new ArrayList<>(h.keySet());
        list.sort((a, b) -> h.get(b) - h.get(a));
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<list.size();i++){
            sb.append(String.valueOf(list.get(i)).repeat(h.get(list.get(i))));
        }
return sb.toString();
    }
}
