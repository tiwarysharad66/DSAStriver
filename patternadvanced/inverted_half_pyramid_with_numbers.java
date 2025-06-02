package patternadvanced;



import java.util.Scanner;


public class inverted_half_pyramid_with_numbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n  =s.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
