package Recursion_op;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Number_of_distinct_Subsequence {
    public static void main(String[] args) {
String s = "abc";
        System.out.println(distinctSubseqII(s));
    }
    public static int distinctSubseqII(String s) {
        List<String> list = new ArrayList<>();
        List<List<String>>l= new ArrayList<>();
 subsequence(0,s,list,l);
        HashSet<String> h = new HashSet<>();
        for(List<String> f:l){
            h.add(String.valueOf(f));
        }
 return (int) (h.size()%(Math.pow(10,9)+7))-1;
    }
    static void subsequence(int index, String s, List<String> list, List<List<String>>l){
        if(index>=s.length()){
            l.add(new ArrayList<>(list));
            return;
        }
        list.add(String.valueOf(s.charAt(index)));
        subsequence(index+1,s,list,l);
        list.removeLast();
        subsequence(index+1,s,list,l);
    }
}

