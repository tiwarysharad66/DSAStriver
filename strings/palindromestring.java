package strings;

public class palindromestring {
    public static void main(String[] args) {
String str = "null";
System.out.println(palindrome(str));
    }
    static boolean palindrome(String str ){
        if( str==null||str.length()==0){
            return true;
        }
        str.toLowerCase();
        for(int i=0;i<str.length();i++){
            char start = str.charAt(i);
            char end  = str.charAt(str.length()-1-i);
            if(start!=end){
                return false;
            }
        }
        return true;
    }
}
