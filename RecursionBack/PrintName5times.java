package RecursionBack;

public class PrintName5times {
    public static void main(String[] args) {
        print(1);
    }
    public static void print(int count){
        System.out.println("sharad");
        if(count==5){
            return;
        }
        count++;
        print(count);
    }
}
