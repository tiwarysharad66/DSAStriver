package stringPrac;


import java.util.Scanner;

public class SumOfBeautyOfAllSubstrings {
    public static void main(String[] args) {
Scanner s = new Scanner(System.in);
String str = s.nextLine();
        System.out.println(beautySum(str));
    }
    public static int beautySum(String s) {
        int c = 0;
for(int i = 0;i<s.length();i++){
    int frequency[] = new int[26];
    for(int j = i;j<s.length();j++){
        frequency[Math.abs(97-s.charAt(j))]+=1 ;
       c+=count(frequency);
    }
}
return c;
    }
    public static int count(int []arr){
        int l = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>0){
                l = Math.max(arr[i],l);
            }

        }
        int nl = Integer.MAX_VALUE;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>0){
                nl = Math.min(arr[i],nl);
            }

        }
        return l-nl;
    }
}
