package Recursion_op;

import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(f(n));
    }
    static int f(int n){
        if(n<=1){
            return n;
        }
        return f(n-1)+f(n-2);
    }
}
