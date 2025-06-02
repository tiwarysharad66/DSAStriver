package stringPrac;

import java.util.Scanner;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
if(str.length()==1){
    System.out.println(str.charAt(0));
}
int maxx = 1;
if(str.length()==1){
    System.out.println();
}
        String longestPalindrome = "";
for(int i = 0;i<str.length();i++){
    for(int j = i;j<str.length();j++){
       if(longest(str.substring(i,j+1))){
           int length = j-i+1;
           if(length>maxx){
               longestPalindrome= str.substring(i,j+1);
               maxx = length;
           }

       }
    }
}
        System.out.println("\n"+ longestPalindrome);
    }
    public static boolean longest(String str){
        int i = 0;
        int j = str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
