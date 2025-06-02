public class reversedigite {
    public static void main(String[] args) {
        System.out.println(reverse(-121));
    }
   static int reverse(int x) {
          long rev =0;
          long ans = x;
          while(x!=0){
             rev = (rev*10)+x%10;
             x = x/10;
          }
          if(rev>Integer.MAX_VALUE||rev<Integer.MIN_VALUE){
              return 0;
          }
          return (int) rev;
   }
}
