import java.util.Scanner;
public class ques1 {

    public static void main(String[] args) {
Scanner s  = new Scanner(System.in);
int size = s.nextInt();
int arr[]= new int[size];
for(int i=0;i<size;i++){
    arr[i]=s.nextInt();
}
int dup = arr[0]
for(int i=0;i<size;i++){
    System.out.println(arr[i]);
}
for(int i=0;i<size;i++){
    for(int j=0;j<size;j++){
        if(arr[i]==arr[j]){
            dup = arr[i];
            break;
        }
    }
}
System.out.println(dup);
    }
}
