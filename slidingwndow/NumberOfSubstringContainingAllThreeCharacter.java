package slidingwndow;

import java.util.HashMap;

public class NumberOfSubstringContainingAllThreeCharacter {
    public static void main(String[] args) {
String s = "aaacb";
        System.out.println(numberOfSubstrings(s));
    }
    public  static int numberOfSubstrings(String s) {
        HashMap<Character, Integer> mp = new HashMap<>();
        int i = 0;
        int j = 0;
        int size = s.length();
        int count = 0;
        while(j<size){
            mp.put(s.charAt(j),mp.getOrDefault(s.charAt(j),0)+1);
            count+=j-i+1;
            j++;
        }


        i=0;
        j=0;
        int c=  0;
        HashMap<Character,Integer> mp2 = new HashMap<>();
        while(j<size){
            mp2.put(s.charAt(j),mp2.getOrDefault(s.charAt(j),0)+1);
            if(mp2.size()>2){
                while(mp2.size()>2){
                    mp2.put(s.charAt(i),mp2.get(s.charAt(i))-1);
                    if(mp2.get(s.charAt(i))==0){
                        mp2.remove(s.charAt(i));
                    }
                    i++;
                }

            }
            c+=j-i+1;
            j++;
        }
        return count-c;
    }
}
