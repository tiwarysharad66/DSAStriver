package Recursion;

public class NumbersExample_Recursion {
    public static void main(String[] args) {
        print(1);
    }
    static void print(int n){
        if(n==5){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        // this is tail recursion
        print(n+1);
    }
}
