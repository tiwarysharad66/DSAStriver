package Recursion_op;

public class ques2 {
    public static void main(String[] args) {
        int sum = 0;
        System.out.println(fact(4));

    }

//    static void print(int n) {
//        if (n == 0) {
//            return;
//        }
//        print(n-1);
//        System.out.println(n);
//    }
//    static void print(int i,int n){
//        if(i>n){
//            return;
//        }
//        System.out.println(i);
//        print(i+1,n);
//    }
//    static void print(int n){
//        if(n==0){
//            return;
//        }
//        System.out.println(n);
//        print(n-1);
//    }
//static void print(int i,int n){
//    if(i>n){
//        return;
//    }
//    print(i+1,n);
//    System.out.println(i);
//}
//    static void print(int i ,int n,int sum){
//        if(i>n){
//            System.out.println(sum);
//            return;
//        }
//        sum+=i;
//        print(i+1,n,sum);
//    }
//static void print(int n,int sum){
//    if(n==0) {
//        System.out.println(sum);
//        return;
//    }
//   print(n-1,sum+n);
//
//}
//    static  int sum(int n){
//        if(n==0){
//            return 0;
//        }
//        return n+sum(n-1);
//    }
    static  int fact(int n){
        if(n==1){
            return 1;
        }
        return n*fact(n-1);
    }

}