package stringPrac;

import java.util.Scanner;

public class LargestOddNumberInString{
    public static void main(String[] args) {
Scanner s = new Scanner(System.in);
String str = s.next();
        System.out.println(largestOddNumber(str));
    }
    public static String largestOddNumber(String num) {
        if(num.length()==1){
    if(Integer.parseInt(num)%2==0){
        return "";
    }
    else{
        return num;
    }
}
for(int i = num.length()-1;i>=0;i--){
    if(Long.parseLong(String.valueOf(num.charAt(i)))%2==1){
        return num.substring(0,i+1);
    }
}
return "";
    }
}
