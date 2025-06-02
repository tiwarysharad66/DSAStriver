package slidingwindow;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class FirstNegativeNumber {
    public static void main(String[] args) {
Scanner s = new Scanner(System.in);
int size = s.nextInt();
int arr[] = new int[size];
for(int i =0;i<size;i++){
    arr[i] = s.nextInt();
}
Vector<Integer> ans = firstnegative(arr,3);
//for(int i=0;i<ans.size();i++){
//    System.out.println(ans.get(i));
//}
        System.out.println(ans);
    }
    public static Vector<Integer> firstnegative(int[]arr,int k){
        ArrayList<Integer> list1 = new ArrayList<>();
        Vector<Integer> vector1 = new Vector<>();
        int size = arr.length;
        int i =0;
        int j = 0;
        while(j<size){
            if(arr[j]<0){
                list1.add(arr[j]);
            }
             if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){
                if(list1.isEmpty()){
                    vector1.add(0);
                }
                else{
                    vector1.add(list1.getFirst());
                    if(list1.getFirst()==arr[i]){
                        list1.removeFirst();
                    }
                }
                i++;
                j++;
             }
        }
        return vector1;
    }
}
