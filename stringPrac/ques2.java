package stringPrac;

import java.util.Scanner;

public class ques2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        StringBuilder sb = new StringBuilder(s.nextLine());
        String str = s.nextLine();
        System.out.println(toggle(str));
    }
    public static String toggle(String str){
//int n = str.length();
//StringBuilder sb = new StringBuilder();
//for(int i = 0;i<n;i++){
//    if(Character.isLowerCase(str.charAt(i))){
//        sb.append(Character.toUpperCase(str.charAt(i)));
//    }
//    else{
//        if(Character.isUpperCase(str.charAt(i))){
//            sb.append(Character.toLowerCase(str.charAt(i)));
//        }
//    }
//}
//return sb.toString();
        int n = str.length();
        for(int i = 0;i<n;i++){
            if(str.charAt(i)==' '){
                continue;
            }
            if(!(str.charAt(i)>=65&&str.charAt(i)<=90||str.charAt(i)>=97&&str.charAt(i)<=122)){
                continue;
            }
            if((int)str.charAt(i)>=97){
                str = str.substring(0,i)+(char)((int)str.charAt(i)-32)+str.substring(i+1,n);
            }
            else{
                str = str.substring(0,i)+(char)((int)str.charAt(i)+32)+str.substring(i+1,n);
            }
        }
        return str;
    }
}
