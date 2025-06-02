package stringPrac;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
String str  [] = {"dog","racecar","car"};
        System.out.println(longestCommonPrefix(str));
    }
    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String a = strs[0];
        int l = 0;
        String b = strs[strs.length-1];
        int k = 0;
        StringBuilder ans  = new StringBuilder();
        while(l<a.length()&& k<b.length()){
            if(a.charAt(l)==b.charAt(k)){
                ans.append(a.charAt(l));
            }
            else{
                break;
            }
            l++;
            k++;
        }
        return ans.toString();
    }
}
