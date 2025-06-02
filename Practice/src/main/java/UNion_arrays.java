import java.util.ArrayList;
import java.util.HashSet;

public class UNion_arrays {
    public static void main(String[] args) {
        int arr[]={2,2,3,4,5};
        int arr2[] = {1,1,2,3,4};
        System.out.println(findUnion(arr,arr2));
    }
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
//        ArrayList<Integer> list = new ArrayList<>();
//int i = 0;
//int j = 0;
//while(i<a.length&&j<b.length){
//    if(a[i]==a[j]&&!list.contains(a[i])&&!list.contains(a[j])){
//        list.add(a[i]);
//    }
//    else if(a[i]>a[j]){
//        if(!list.contains(a[i])&&!list.contains(a[j])){
//            list.add(a[j]);
//            list.add(a[i]);
//        }
//        else if(!list.contains(a[i])){
//            list.add(a[i]);
//        }
//        else{
//            list.add(a[j]);
//        }
//
//    }
//    else{
//        if(!list.contains(a[i])&&!list.contains(a[j])){
//            list.add(a[j]);
//            list.add(a[i]);
//        }
//        if(!list.contains(a[i])){
//            list.add(a[i]);
//
//        }
//        else{
//            if(!list.contains(a[j])){
//                list.add(a[j]);
//            }
//        }
//
//    }
//    i++;
//    j++;
//}
//return list;
        HashSet<Integer> h = new HashSet<>();
        for(int i = 0;i<a.length;i++){
            h.add(a[i]);
            h.add(b[i]);
        }
        ArrayList<Integer> list = new ArrayList<>(h);
        return list;
    }
}
