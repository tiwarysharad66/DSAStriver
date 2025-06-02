import java.util.ArrayList;
import java.util.Scanner;
public class Arraylist<I extends Number> {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer>list = new ArrayList<>();
        for(int i=0;i<5;i++){
            list.add(s.nextInt());
        }
//        System.out.print(list);
        for(int i=0;i<5;i++){
        System.out.println( list.get(i));
        }

    }
}
