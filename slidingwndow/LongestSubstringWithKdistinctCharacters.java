package slidingwndow;

import java.util.HashMap;

public class LongestSubstringWithKdistinctCharacters {
    // at most K unique Characters or atmost k distinct characters
    public static void main(String[] args) {
String s = "bacda";
        System.out.println(getLengthofLongestSubstring(s,3));
    }
    public static int getLengthofLongestSubstring(String s, int k) {
int size=  s.length();
int i = 0;
int j = 0;
int max = 0;
        HashMap<Character,Integer> mp = new HashMap<>();
        while(j<size){
            mp.put(s.charAt(j),mp.getOrDefault(s.charAt(j),0)+1);
            if(mp.size()>k){
                while(mp.size()>k){
                    mp.put(s.charAt(i),mp.get(s.charAt(i))-1);
                    if(mp.get(s.charAt(i))==0){
                        mp.remove(s.charAt(i));
                    }
                    i++;
                }
            }
            max = Math.max(max,j-i+1);
            j++;
        }
        return max;
    }
}
