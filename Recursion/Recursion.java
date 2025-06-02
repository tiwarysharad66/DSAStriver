package Recursion;

public class Recursion {
    public static void main(String[] args) {
        int n = 16;
        System.out.println(fact(n));
    }
    static int  fact(int n ){
        if(n==1||n==0){
            return n;
        }
        else{
            return n*fact(n-1);
        }
    }
}
