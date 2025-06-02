import java.util.Scanner;

public class pattern5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        pattern(n);
    }
    public static void pattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=0;j<n-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
