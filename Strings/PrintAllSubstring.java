package Strings;

import java.util.Arrays;

public class PrintAllSubstring {
    public static void main(String[] args) {
        String str = "abcdefghijk";
//        for(int i = 0;i<str.length();i++){
//            for(int j = i;j<str.length();j++){
//                System.out.print(str.substring(i,j)+ " ");
//            }
//        }
//        int[] arr = {1,2,3};
//        int[] brr  = {1,2,3};
//        arr[0] = 4;
//        System.out.println(Arrays.toString(brr));
//        System.out.println(Arrays.toString(arr));
//        String s  = "hello";
//        String ss= new String("hello");
//        String d = "hr";
//        System.out.println(s.hashCode());
//        System.out.println(ss.hashCode());
//        System.out.println(d.hashCode());
//        String s = "hello"; → A string literal "hello" is stored in the string pool.
//        String ss = new String("hello"); → A new object is created in the heap, but since the hashCode() method in String is overridden to return a value based on the content, the hash code of s and ss will be the same.
//        String d = "hr"; → A different string, so it will have a different hash code.
        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");
        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));
    }


}
