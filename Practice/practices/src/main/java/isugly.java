public class isugly {
    public static void main(String[] args) {
        System.out.println(isUgly(14));
    }
    public static boolean isUgly(int n) {
        if(n<=0){
            return false;
        }
        if(n==1){
            return true;
        }
        for(int i=2;i<=n;i++){
            if(n%i==0&&prime(i)&&i!=2&&i!=3&&i!=5){
                return false;
            }
        }
        return true;

    }
    public static boolean prime(int n){
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

}
