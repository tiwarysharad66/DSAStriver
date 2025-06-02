package slidingwndow;

import java.util.HashMap;

public class FruitIntoBasket {
    public static void main(String[] args) {
Integer[] arr = {3,1,2,2,2,2};
        System.out.println(totalElements(arr));
    }
    public static int totalElements(Integer[] arr) {
        int size = arr.length;
        int i = 0;
        int j = 0;
        int max = 0;
        HashMap<Integer,Integer> mp = new HashMap<>();
        while(j<size){
            mp.put(arr[j],mp.getOrDefault(arr[j],0)+1);
            if(mp.size()>2){
                while(mp.size()>2){
                 mp.put(arr[i],mp.get(arr[i])-1);
                 if(mp.get(arr[i])==0){
                     mp.remove(arr[i]);
                 }
                 i++;
                }
            }
            max = Math.max(max,j-i+1);
            j++;
        }
        return max;
    }
}
