import java.util.Scanner;

public class pattern10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        pattern(n);
    }

    public static void pattern(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            int stars = i;
            if (i > n)
                stars = 2 * n - i;
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}

