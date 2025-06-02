package introduction;
import java.util.Scanner;

public class codeforces228A {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int count = 0;
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        int n3 = s.nextInt();
        int n4 = s.nextInt();
        int arr[] = {n1, n2, n3, n4};
        for (int i = 0; i < arr.length; i++) {
            if (arr[0] == arr[1] || arr[0] == arr[2] || arr[0] == arr[3]) {
                count++;
            }
        }
        System.out.println(count);

    }
}
