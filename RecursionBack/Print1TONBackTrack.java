package RecursionBack;

public class Print1TONBackTrack {
    public static void main(String[] args) {
        f(3);
    }
    public static void f(int n){
        if(n==0){
            return;
        }
        f(n-1);
        System.out.println(n);
    }
}
