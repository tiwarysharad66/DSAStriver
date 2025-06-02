import java.util.ArrayList;

public class Rearrange_Array_Elements {
    public static void main(String[] args) {
  int arr[] = {3,1,-2,-5,2,-4};

    }
    public  static int[] rearrangeArray(int[] nums) {
int size = nums.length;
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
for(int i=0;i<size;i++){
if(nums[i]>0){
    list.add(nums[i]);
}
else{
    list2.add(nums[i]);
}
}
int[] arr = new int[list.size()+list2.size()];
for(int i=0;i<arr.length-1;i++){
    arr[i] = list.get(i);
    arr[i+1] = list.get(i);
}
return arr;
    }
}
