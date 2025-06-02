package Recursion_op;

import java.util.Scanner;

public class nto1 {
//    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        int n = s.nextInt();
//        f(n);
//    }
//    static void f(int n){
//        if(n<1){
//            return;
//        }
//        System.out.println(n);
//        f(n-1);
//    }
public static void main(String[] args) {
//    Scanner s = new Scanner(System.in);
//    int n = s.nextInt();
//    f(n,n);
//}
//static void f(int i,int n){
//    if(i<1){
//        return;
//    }
//    System.out.println(i);
//    f(i-1,n);
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    f(1,n);
}
static void f(int i,int n){
    if(i>n){
        return;
    }
    f(i+1,n);
    System.out.println(i);
}
}
