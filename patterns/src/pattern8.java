import java.util.Scanner;

public class pattern8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        pattern(n);
    }
    public static void pattern(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<2*n-(2*i+1);k++){
                System.out.print("*");
            }
            for(int l=0;l<0;l++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
