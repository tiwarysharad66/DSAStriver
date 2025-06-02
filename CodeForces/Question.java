package CodeForces;

import java.util.Scanner;

public class Question {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        s.nextLine();
        while(t-->0) {
            String str = s.nextLine();

            String ans = "";
            String target = "us";
            int rep = str.lastIndexOf("us");
            if(rep!=-1){
                StringBuilder sb = new StringBuilder(str);
                  sb.replace(rep,rep+target.length(),"i");
                ans = sb.toString();
            }

            System.out.println(ans);
        }
    }
}
