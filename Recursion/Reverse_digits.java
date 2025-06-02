package Recursion;

public class Reverse_digits {
    public static void main(String[] args) {
        int n = 1824;
//        reverse1(1234);
//        System.out.println(sum);
        System.out.println(rev2(1234));
    }
    static int sum =0;
    static void reverse1(int n){
        if(n==0){
            return;
        }
        int rem = n%10;
        sum = sum*10+rem;
        reverse1(n/10);
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
