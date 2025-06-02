package stringPrac;
import java.util.*;
public class Ques1 {

    public static void main(String[] args) {
String str = "a good   example";
        System.out.println(reverseWords(str));
    }

    public static void reverse(String arr[]){
        int i = 0;
        int j = arr.length-1;
        while(i<j){
            String temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static String  reverseWords(String str) {
        str = str.trim();

        // Replace multiple spaces with a single space
        str = str.replaceAll("\\s+", " ");
        String[] arr = str.split(" ");
        reverse(arr);
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<arr.length;i++){
            sb.append(arr[i]);
            if(i!=arr.length-1){
                sb.append(" ");
            }
        }
        System.out.println(sb);
return sb.toString();
    }
}
