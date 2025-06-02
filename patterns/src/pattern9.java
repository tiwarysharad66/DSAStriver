import java.util.Scanner;

public class pattern9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        pattern(n);
        pattern2(n);
    }

    public static void pattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            for (int l = 0; l < n - i - 1; l++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
        public static void pattern2( int n) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < 2 * n - (2 * i + 1); k++) {
                    System.out.print("*");
                }
                for (int l = 0; l < 0; l++) {
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
        }
