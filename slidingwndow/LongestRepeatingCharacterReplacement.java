package slidingwndow;

import java.sql.SQLOutput;
import java.util.HashMap;

public class LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {
String s = "AABABBA";
        System.out.println(characterReplacement(s,1));
    }
    public static int characterReplacement(String s, int k) {
          int size = s.length();
          int i = 0;
          int j = 0;
          int start = 0;
          int end = 0;
          int max = 0;
        HashMap<Character,Integer> mp = new HashMap<>();
          while(j<size){
              mp.put(s.charAt(j),mp.getOrDefault(s.charAt(j),0)+1);
              if(mp.size()<k){
                  j++;
              }
              if(mp.size()==k){
                  if(j-i+1>max){
                      start = i;
                      end = j;
                      max =j-i+1;
                  }
                  j++;
              }
              if(mp.size()>k) {
                  while (mp.size() > k) {
                      mp.put(s.charAt(i), mp.get(s.charAt(i)) - 1);
                      if (mp.get(s.charAt(i)) == 0) {
                          mp.remove(s.charAt(i));
                      }
                      i++;
                  }
                  if(mp.size()==k){
                      if(j-i+1>max) {
                          start = i;
                          end = j;
                          max = j - i + 1;
                      }
                  }
                  j++;
              }

          }
          s = s.replace(s.charAt(start),s.charAt(end+1));
          int count = 0;
          for(int p = start;p<s.length()-1;p++){
              if(!(s.charAt(p)==s.charAt(p+1))){
                  count = p+1;
                  break;
              }
          }
          return count;
    }
}
