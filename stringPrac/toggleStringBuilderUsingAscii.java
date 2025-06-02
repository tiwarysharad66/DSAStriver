package stringPrac;

import java.util.Scanner;

public class toggleStringBuilderUsingAscii {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        StringBuilder str = new StringBuilder(s.nextLine());
        System.out.println(toggle(str));
    }
    public static StringBuilder toggle(StringBuilder sb){
        int n = sb.length();
        for(int i = 0;i<sb.length();i++){
            if(sb.charAt(i)==' '){
                continue;
            }
            if(!(sb.charAt(i)>=65&&sb.charAt(i)<=90||sb.charAt(i)>=97&&sb.charAt(i)<=122)){
                continue;
            }
            if((int)sb.charAt(i)>=97){
                sb.setCharAt(i,(char)((int) sb.charAt(i)-32));
            }
            else{
                sb.setCharAt(i, (char) ((int)sb.charAt(i)+32));
            }
        }
        return sb;
    }
}
