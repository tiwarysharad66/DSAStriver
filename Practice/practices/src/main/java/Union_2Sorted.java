import java.util.ArrayList;

public class Union_2Sorted {
    public static void main(String[] args) {
        System.out.println(findUnion(new int[]{-8,-3,-3,-2,0,1,2,2,6},new int[]{-9,-9,0}));
    }
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        int size = a.length;
        int size2 = b.length;
        ArrayList<Integer> list = new ArrayList<>();
        int i=0;
        int j = 0;
        while(i<size&&j<size2){
            if(a[i]==b[j]){
                if(!list.isEmpty()&&!list.contains(a[i])){
                    list.add(a[i]);
                }
                else if(list.isEmpty()){
                    list.add(a[i]);
                }
                i++;
                j++;
            }
            else if(a[i]<b[j]){
                if(!list.isEmpty()&&!list.contains(a[i])){
                    list.add(a[i]);
                }
                else if(list.isEmpty()){
                    list.add(a[i]);
                }
                i++;
            }
            else{
                if(!list.isEmpty()&&!list.contains(b[j])){
                    list.add(b[j]);
                }
                else{
                    if(list.isEmpty()){
                        list.add(b[j]);
                    }

                }

                j++;
            }
        }
        if(i>=size){
            while(j<size2){
                if(!list.isEmpty()&&!list.contains(b[j])) {
                    list.add(b[j]);
                }
                j++;
            }
        }
        else{
            while(i<size){
                if(!list.isEmpty()&&!list.contains(a[i])) {
                    list.add(a[i]);
                }

                i++;
            }
        }

        return list;
    }
}
