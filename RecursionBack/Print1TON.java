package RecursionBack;

public class Print1TON {
    public static void main(String[] args) {
        int num = 1;
        int n = 5;
        f(num,n);
    }public static void f(int num,int n){
        if(num>n){
            return;
        }
        System.out.println(num);
        num++;
        f(num,n);
    }
}
