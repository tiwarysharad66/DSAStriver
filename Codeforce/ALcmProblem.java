package Codeforce;

import java.util.Scanner;

public class ALcmProblem {
    public static void main(String[] args) {
Scanner s = new Scanner(System.in);
int t = s.nextInt();
while((t--)>0){
    int l = s.nextInt();
    int r = s.nextInt();
    int gcd = gcdd(l,r);
}
    }
    public static int gcdd(int l,int r){
        int i = 2;
        int ans = 0;
        while(i<Math.max(l,r)){
            if(l%i==0&&r%i==0){
                ans = i;
            }
        }
        return 1;
    }
}
