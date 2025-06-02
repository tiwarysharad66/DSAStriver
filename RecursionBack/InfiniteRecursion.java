package RecursionBack;

public class InfiniteRecursion {
    public static void main(String[] args) {
        f(1);
    }
    public static void f(int count){
        if(count==2){
            return;
        }
        System.out.println(count);
                count++;

        f(count);
    }
}
