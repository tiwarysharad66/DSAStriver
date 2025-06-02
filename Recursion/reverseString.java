package Recursion;

public class reverseString {
    public static void main(String[] args) {
String[] s = {"h","e","l","l","o"};
    }
    public void reverseString(char[] s) {
helper(s,0);
        System.out.println(s);

    }
    public void helper(char[]arr,int i){
        if(i==arr.length){
            return;
        }
        char temp = arr[i];
        arr[i] = arr[arr.length-i-1];
        arr[arr.length-i-1] = temp;
        helper(arr,++i);
    }
}
