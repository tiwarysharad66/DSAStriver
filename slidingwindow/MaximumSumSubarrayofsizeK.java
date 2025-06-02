package slidingwindow;

import java.util.*;

public class MaximumSumSubarrayofsizeK {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();

        }
       
        System.out.println(maximum(arr,3));
    }
      public static int maximum(int[]arr,int k){
          int i = 0;
          int j = 0;
          int sum = 0;
          int max = 0;
         int[] newarr = removeDuplicates(arr);
          while(j<newarr.length){
              sum+=newarr[j];
              if(j-i+1<k){
                  j++;
              }
            else if(j-i+1==k){
                max = Math.max(sum,max);
                sum = sum-newarr[i];
                i++;
                j++;
              }
          }
          return max;
        }

    public static int[] removeDuplicates(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        List<Integer> result = new ArrayList<>();

        for (int num : arr) {
            if (!seen.contains(num)) {
                result.add(num);
                seen.add(num);
            }
        }

        // Convert arrayList to int array
        int[] uniqueArr = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            uniqueArr[i] = result.get(i);
        }
        System.out.println(Arrays.toString(uniqueArr));

        return uniqueArr;
    }
}

