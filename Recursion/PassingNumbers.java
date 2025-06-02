package Recursion;

public class PassingNumbers {
    public static void main(String[] args) {
        int n = 5;
        pass(n);
    }
    static void pass(int n){
        if(n==0){
            return ;
        }
        else{
            System.out.println(n);
//            pass(n--);//infinite recursive calls due to postincreament it pass n to n to every calls and stackoverflow
            pass(--n); //this sounds good as preincreament
        }
    }
}
