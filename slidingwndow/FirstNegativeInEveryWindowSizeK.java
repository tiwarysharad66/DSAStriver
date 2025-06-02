package slidingwndow;

import java.util.ArrayList;
import java.util.List;

public class FirstNegativeInEveryWindowSizeK {
    public static void main(String[] args) {
        int arr[] =  {12,-1,-7,8,-15,30,16,28};
        System.out.println(firstneg(arr,3));
    }
    public static List<Integer> firstneg(int []arr, int k){
      List<Integer> neg = new ArrayList<>();
      List<Integer> ans = new ArrayList<>();
      int i = 0;
      int j = 0;
      int size = arr.length;
      while(j<size){
if(arr[j]<0){
    neg.add(arr[j]);
}
if(j-i+1<k){
    j++;
}
else if(j-i+1==k){
    if(neg.isEmpty()){
        ans.add(0);
    }
    else {
        ans.add(neg.getFirst());
        if(arr[i]<0){//not needed without this even it is correct
            if (arr[i] == neg.getFirst()) {
                neg.removeFirst();
            }
        }
    }
    i++;
    j++;
}
      }
        return ans;
    }
}
