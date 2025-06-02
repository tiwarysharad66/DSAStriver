package RecursionBack;

public class Nto1 {
    public static void main(String[] args) {
        f(1,3);
    }
    public static void f(int i ,int n ){
        if(i>n){
            return;
        }
        f(i+1,n);
        System.out.println(i);
    }
}
