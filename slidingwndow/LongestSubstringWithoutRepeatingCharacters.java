package slidingwndow;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
    }
    public static int lengthOfLongestSubstring(String s) {
         int size = s.length();
        HashMap<Character,Integer>  mp = new HashMap<>();
        int i = 0;
        int j = 0;
        int max = 0;
        while(j<size){
            mp.put(s.charAt(j),mp.getOrDefault(s.charAt(j),0)+1);
            System.out.println(mp);
            if(j-i+1<mp.size()){
                j++;
            }

            else if(j-i+1==mp.size()){
                max = Math.max(j-i+1,max);
                System.out.println(max);
                j++;
            }
            else if(j-i+1>mp.size()){
                while(j-i+1>mp.size()){
                        mp.put(s.charAt(i),mp.get(s.charAt(i))-1);
                        if(mp.get(s.charAt(i))==0){
                            mp.remove(s.charAt(i));
                        }
                    System.out.println(mp);
                        i++;
                        if(j-i+1==mp.size()){
                            max = Math.max(j-i+1,max);
                        }
                }
                j++;
            }
        }
        return max;

    }
}
