package stringPrac;

import java.util.Scanner;

public class RotateString {
    public static void main(String[] args) {
Scanner s = new Scanner(System.in);
String str = s.nextLine();
String goal = s.nextLine();
        System.out.println(rotateString(str,goal));
    }
    public static  boolean rotateString(String s, String goal) {
        int size = s.length();
        for(int i =0;i<s.length();i++){
            s=s.substring(1)+s.charAt(0);
            System.out.println(s);
            if(s.equals(goal)) return true;
        }
return false;
    }
}
