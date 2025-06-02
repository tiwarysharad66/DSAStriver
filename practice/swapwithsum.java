package practice;

import java.util.Scanner;

public class swapwithsum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        a = a-b;
        b = a+b;
        a = b-a;
        System.out.println(a+ " "+ b);
    }
}
