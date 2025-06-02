package strings;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String name  = "Sharad kumar";
        System.out.println(Arrays.toString(name.toCharArray()));
       System.out.println(name.toLowerCase());
       System.out.println(name);
       System.out.println(name.indexOf('a'));
       System.out.println("     sharad".strip());
      System.out.println(Arrays.toString(name.split(" ")));
    }
}
