import java.util.Scanner;

public class codeforces11A {
    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);
        int n  =s.nextInt();
        int d = s.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = s.nextInt();
        }
        int count = count(arr,d);
        System.out.println(count);

    }
    public static int count (int arr[],int d){
        int count= 0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                while(arr[i]>arr[i-1]) {
                    count++;
                    int add = arr[i] += d;

                }
            }
        }
        return count;
    }

}
