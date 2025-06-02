package RecursionBack;

public class PrintNTO1 {
    public static void main(String[] args) {
        f(5);
    }
    public static void f(int n){
              if(n==0){
                  return;
              }
        System.out.println(n);
              n--;
              f(n);
    }
}

