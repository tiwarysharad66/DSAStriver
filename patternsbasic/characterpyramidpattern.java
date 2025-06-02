package patternsbasic;

import java.util.Scanner;

public class characterpyramidpattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        char x = 'a';
        for(int i =1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(x);
                x++;
            }

            System.out.println();
        }

    }
}
