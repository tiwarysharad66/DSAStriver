package slidingwndow;

import java.util.HashMap;

public class MinimumWindowSubstring {
    public static void main(String[] args) {
String s = "a";
String t = "aa";
        System.out.println(minWindow(s,t));
    }
    public static  String minWindow(String s, String t) {
int size = s.length();
int min = Integer.MAX_VALUE;
        HashMap<Character,Integer> mp = new HashMap<>();
        for(int i = 0;i<t.length();i++){
            mp.put(t.charAt(i),mp.getOrDefault(t.charAt(i),0)+1);
        }
        int i = 0;
        int j  =0;
        int start = 0;
        int end = 0;
        int count = mp.size();
        while(j<size){
             if(mp.containsKey(s.charAt(j))){
                 mp.put(s.charAt(j),mp.get(s.charAt(j))-1);
                 if(mp.get(s.charAt(j))==0){
                     count--;
                 }
             }
             if(count==0){
                 while(count==0){
                     if(j-i+1<=min){
                         min = j-i+1;
                         start = i;
                         end = j;
                     }
                     if(mp.containsKey(s.charAt(i))){
                         mp.put(s.charAt(i),mp.get(s.charAt(i))+1);
                         if(mp.get(s.charAt(i))==1){
                             count++;
                         }
                     }
                     i++;
                 }
             }
            j++;
        }
        if(min==Integer.MAX_VALUE){
            return "";
        }
        return  s.substring(start,end+1);
    }
}
