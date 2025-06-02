import java.util.Arrays;

public class gcdlcm {
    public static void main(String[] args) {
        System.out.println((Arrays.toString(lcmAndGcd(48, 18))));
    }
    public static int[] lcmAndGcd(int a, int b) {
//        int gcd = 0;
//        for(int i=Math.min(a,b);i>=0;i++){
//            if(a%i==0 && b%i==0){
//                gcd =i;
//                break;
//            }
//        }
//        int lcm = (Math.abs(a*b))/gcd;
//        return new int[]{lcm,gcd};
        int gcd = 0;
        int m1  = a;
        int m22 = b;
        while(a!=b) {
            int m = Math.max(a, b);
            int m2 = Math.min(a,b);
            a =m-m2;
            b=m2;
        }
        gcd = a;
        int lcm = (Math.abs(m1*m22))/gcd;
        return new int[]{lcm,gcd};
    }
}
