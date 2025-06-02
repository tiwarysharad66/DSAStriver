package Recursion_op;

import java.util.*;

public class intersection {
    public static void main(String[] args) {
       int arr[] = {1,2,2,1};
       int arr2[] = {2,2};
        System.out.println(Arrays.toString(intersect(arr,arr2)));
    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list  = new ArrayList<>();
        List<Integer> list2  = new ArrayList<>();
        Map<Integer,Integer> mp= new HashMap<>();
        Map<Integer,Integer>mp2 = new HashMap<>();
        for(int k = 0;k<nums1.length;k++){
            mp.put(nums1[k],mp.getOrDefault(nums1[k],0)+1);
        }
        for(int l = 0;l<nums2.length;l++){
            mp.put(nums1[l],mp.getOrDefault(nums1[l],0)+1);
        }
        for(int i=0;i<nums1.length;i++){
            list.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            list2.add(nums2[i]);
        }
        list.retainAll(list2);
        int size = list.size();
        int ans[] = new int[size];
        for(int i=0;i<size;i++){
            ans[i] = list.get(i);
        }
return ans;
    }
}
