package Recursion;

public class Sum_Of_Digits {
    public static void main(String[] args) {
        int n = 1234;
        System.out.println(sumdigits(n));
    }
    static int sumdigits(int n){
//        if(n%10==1){
//            return n;
//        }
        if(n==0){
            return 0;
        }
//        return n%10*sumdigits(n/10);
        return n%10+sumdigits(n/10);
    }
}
