package Recursion;

public class Palindrome {
    public static void main(String[] args) {
        int n = 13314 ;
        System.out.println(palindrome(1331));
    }
    static boolean palindrome(int n){
//        if(n==rev2(n)){
//            return true;
//        }
//        return false;
        return n==rev2(n);
    }
    static int rev2(int n){
        int digits = (int)(Math.log10(n)) +1;
        return helper(n,digits);
    }
    static int helper(int n,int digits ){
        if(n%10==1){
            return n;
        }
        return (int) (n%10*Math.pow(10,digits-1)+helper(n/10,digits-1));
    }
}
