public class countdigits {
    public static void main(String[] args) {

        System.out.println(evenlyDivides(43));
    }
   static  int evenlyDivides(int n) {
        int count = 0;
       int r = n;
        while(n!=0){
            if(n%10!=0&&r%(n%10)==0){
              count++;
            }
            n = n/10;
        }
        return  count;
    }
}
