package Recursion_op;

public class StringPal {
    public static void main(String[] args) {
    String str = "madsm";
        System.out.println(pal(str,0));
    }
    static boolean pal(String str,int i){
        if(i>=str.length()/2){
            return true;
        }
        if(str.charAt(i)==str.charAt(str.length()-i-1)){
            return pal(str,i+1);
        }
        else{
            return false;
        }
    }
}
