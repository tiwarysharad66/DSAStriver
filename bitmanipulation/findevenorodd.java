package bitmanipulation;

public class findevenorodd {
    public static void main(String[] args) {
        int x = 11;
        System.out.println(isodd(x));
    }

    private static boolean isodd(int x) {
        return ((x&1)==1);
    }
}
