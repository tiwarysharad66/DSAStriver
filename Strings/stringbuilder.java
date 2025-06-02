package Strings;

public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");
        sb.append('c');
        System.out.println(sb);
        sb.setCharAt(0,'c');
        sb.append(true);
        System.out.println(sb);
        sb.insert(0,3.3);
        System.out.println(sb);
        sb.deleteCharAt(0);
        System.out.println(sb);
//        sb.reverse();

        sb.delete(0,11);
        System.out.println(sb);
          
    }
}
