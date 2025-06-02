package Recursion_op;

public class String_Palindrome {
    public static void main(String[] args) {
        String s = "11211";
        int left = 0;
//        palindrome(left,s);
        System.out.println(palindrome(left,s));
    }
    static boolean palindrome(int left,String s){
        if(left>=s.length()/2){
            return true;
        }
        if(s.charAt(left)==s.charAt(s.length()-left-1)){
         return palindrome(left+1,s);
        }
        else{
            return false;
        }
    }
}
