public class reversedigit {
    public static void main(String[] args) {

    }

  static  boolean isPalindrome(int x) {
boolean ans = palin(121);
return ans;
    }
    static boolean palin(int x){
        int reverse = 0;
        int n = x;
        while(x!=0){
            reverse = (reverse*10)+x%10;
            x = x/10;
        }
        if(reverse==n){
            return true;
        }
        return false;
    }
}
