package recursion_practice;

import java.util.Scanner;

public class Ques1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for(int i= t;i>0;i--){
            String str = s.next();
            StringBuilder sb = new StringBuilder();
            removeduplicate(0,str,sb);
            System.out.println(sb);
        }
    }
    static void removeduplicate(int index,String str,StringBuilder sb){
        if(index==str.length()){
            return;
        }
        if(sb.isEmpty()){
            sb.append(str.charAt(index));
        }
         if(sb.charAt(sb.length() - 1) != str.charAt(index)){
            sb.append(str.charAt(index));
        }
        removeduplicate(index+1,str,sb);
    }
}
