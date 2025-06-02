import java.util.Scanner;
public class codeforces233 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if (n % 2 != 0) {
            System.out.println("-1");
        } else {
            print(n);
        }
    }
    public static void print(int n) {
        for (int i = 2; i <=n; i++) {
            System.out.print(i+ " "+ (i-1)+" ");
        }
    }
}
