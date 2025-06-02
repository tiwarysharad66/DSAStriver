package RecursionBack;
import java.util.*;
public class Subsets {
    public static void main(String[] args) {
int arr[] = {1,2,3};
List<List<Integer>> ans = new ArrayList<>();
        ans = subsets(arr);
        System.out.println(ans);

    }
    public static List<List<Integer>> subsets(int arr[]){
      List<List<Integer>>ans = new ArrayList<>();
      List<Integer> list = new ArrayList<>();
      subset(0,arr,ans,list);
      return ans;
    }
    public static void subset(int idx,int arr[],List<List<Integer>> ans,List<Integer> list){
        if(idx==arr.length){
            ans.add(new ArrayList<>(list));
            return;
        }
        list.add(arr[idx]);
        subset(idx+1,arr,ans,list);
        list.removeLast();
        subset(idx+1,arr,ans,list);
    }
}
