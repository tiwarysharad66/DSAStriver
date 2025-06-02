package patternadvanced;
import java.util.*;
public class invertedrectangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int rows  = s.nextInt();
        for(int i=1;i<=rows;i++){
            //spaces
            for(int j=1;j<=rows-i;j++){
                System.out.print(" ");
            }
            //stars
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
