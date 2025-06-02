package Recursion_op;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        f(n,0);
    }
    static void f(int i ,int sum){
        if(i<1){
            System.out.println(sum);
            return;
        }
        f(i-1,sum+i);
    }
}
