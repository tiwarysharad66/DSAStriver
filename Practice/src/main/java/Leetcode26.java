import java.util.*;

public class Leetcode26 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= s.nextInt();
        }
        System.out.println(removeDuplicates(arr));
    }
     public static int removeDuplicates(int[] nums) {
//         HashSet<Integer> h = new HashSet<>();
//         for (int i = 0; i < nums.length; i++) {
//             h.add(nums[i]);
//         }
//         System.out.println(h);
//         int k =0;
//         for(int n:h){
//             nums[k++] =n;
//         }
//         for(int j=k;j<nums.length;j++){
//             nums[j]=0;
//         }
////         return h.size();
////         int counter =0;
////         int size = nums.length;
////         for (int i = 0; i < size-1; i++) {
////             if(nums[i]==nums[i+1]){
////                 counter++;
////             }
////             else{
////                 nums[i-counter] = nums[i];
////             }
////         }
////         nums[counter-1] = nums[size-1];
////         for(int i = counter+1;i<size;i++){
////             nums[i] =0;
////         }
////         System.out.println(Arrays.toString(nums));
////         return counter+1;
//         System.out.println(Arrays.toString(nums));
//         return k;
         List<Integer> list = new ArrayList<>();
         for(int i = 0;i<nums.length-1;i++){
             if(nums[i]!=nums[i+1]){
                 list.add(nums[i]);
             }
         }
         list.add(nums[nums.length-1]);
         System.out.println(list);
         int k = 0;
         for(int n:list){
             nums[k++] = n;
         }
         for(int j =k+1;j<nums.length;j++){
             nums[j] = 0;
         }
         System.out.println(Arrays.toString(nums));
         return k;
    }
}
