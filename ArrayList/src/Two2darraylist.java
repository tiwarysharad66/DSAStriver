import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Two2darraylist {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i=0;i<3;i++){
            list.add(new ArrayList<>());
        }
        for(int i=0;i<3;i++){
            list.get(i).add(s.nextInt());
        }
        System.out.println(list);
    }
}
