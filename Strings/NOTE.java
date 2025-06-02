package Strings;

public class NOTE {
    public static void main(String[] args) {
        String str = "abcd";
        //we can directly assign a string to a stringBuilderr
        StringBuilder sb = new StringBuilder(str);
        //but not a stringBuilder to a string
        String s = sb+ " ";
        //use ""
        // or String.valueOf

    }
}
