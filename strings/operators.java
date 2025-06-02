package strings;

import java.util.ArrayList;

public class operators {
    public static void main(String[] args) {
        System.out.println('a'+'b');
        System.out.println("a"+"b");
        System.out.println((char)('a'+3));
        System.out.println("a"+1);
        //this is same as after a few steps : "a"+"1"
        // when an integer is added or concatenated with a string then it is converted into its wrapper class "INTEGER that will call toString()method
  System.out.println("sharad"+ new ArrayList<>());
  String ans  = new Integer(56)+" abc"+ new ArrayList<>();
  System.out.println(ans);
//      String ans =   new Integer(56)+ new ArrayList<>(); gives error as one should be string
    }
}
