package Recursion_op;

import java.util.Scanner;

public class Print_1toN {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        func(1,n);
    }
    static void func(int i,int n){
    if(i>n){
        return;
    }
        System.out.println(i);
    func(i=i+1,n);
}
    }
