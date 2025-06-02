import java.util.Scanner;

public class pattern4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        pattern(n);
    }
    public static void pattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i +" ");
            }
            System.out.println();
        }
    }
}
