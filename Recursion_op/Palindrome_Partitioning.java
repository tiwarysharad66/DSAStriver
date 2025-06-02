package Recursion_op;

import java.util.ArrayList;
import java.util.List;

public class Palindrome_Partitioning {
    public static void main(String[] args) {
String s = "aabb";
        System.out.println(partition(s));
    }
    public static List<List<String>> partition(String s) {
        List < List < String >> res = new ArrayList< >();
        List < String > path = new ArrayList < > ();
        func(0, s, path, res);
        return res;
    }
  static  void func(int index,String s,List<String>path,List<List<String>>res){
        if(index==s.length()){
            res.add(new ArrayList<>(path));
        }
        for(int i = index;i<s.length();++i){
            if(ispalindrome(s,index,i)){
                path.add(s.substring(index,i+1));
                func(i+1,s,path,res);
                path.removeLast();
            }

        }
    }
 static boolean  ispalindrome(String s,int start,int end){
        for(int i = start;i<=end;i++){
            if(s.charAt(i)!=s.charAt(end)){
                return false;
            }
        }
        return true;
  }
}
