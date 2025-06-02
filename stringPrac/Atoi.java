package stringPrac;

import java.util.Scanner;

public class Atoi {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println(myAtoi(str));
    }
    public static int myAtoi(String s) {
        int i = 0;
        int ans = 0;
        if(s.isEmpty()){
            return 0;
        }

        while(i<s.length()&&s.charAt(i)==' '){
            i++;
        }
        if(i==s.length()){
            return 0;
        }
        int flag = 1;
        if(i<s.length()&&s.charAt(i)=='+'||s.charAt(i)=='-'){
            if(s.charAt(i)=='-'){
                flag = -1;
            }
            i++;
        }


        while(i<s.length()&&s.charAt(i)>='0'&&s.charAt(i)<='9'){
            int digit = s.charAt(i)-'0';//can also use parseint
            if(ans>(Integer.MAX_VALUE-digit)/10){
                if(flag==1){
                    return Integer.MAX_VALUE;
                }
                else {
                    return  (flag)*Integer.MIN_VALUE;
                }
            }

            ans = ans*10+digit;
            i++;
        }
        return (flag)* ans;
    }
}
