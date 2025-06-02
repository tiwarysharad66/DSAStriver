package Recursion_op;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        System.out.println(f(n));
    }
    static int f(int n){
        if(n==1){
            return 1;
        }
        return n*f(n-1);
    }
}
