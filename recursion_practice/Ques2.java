package recursion_practice;

import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        Pow(5,2);
    }
    public static long Pow(int X, int N) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for(int i = t;i>0;i--){
            X = s.nextInt();
            N = s.nextInt();
            System.out.println(p(X,N,0,1));
        }
        return 0;
    }
    static long p(int x,int n,int i,int ans){
        if(x==0&&n==0){
            return 1;
        }
        if(n==1){
            return 1;
        }
        if(i==n){
            return ans;
        }
        ans*=x;
        return p(x,n,i+1,ans);
    }

}
