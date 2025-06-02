package stack2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class NGT {
    public static void main(String[] args) {
        int arr[] = {4,1,2};
        int arr2[] = {1,3,4,2};
        System.out.println(Arrays.toString(nextGreaterElement(arr,arr2)));
    }
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i = 0;i<nums1.length;i++){
            for(int j = 0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    h.put(nums1[i],j);
                    break;
                }
            }
        }
        int size = nums2.length;
        int[] result = new int[size];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < size; i++) {
            while (!stack.isEmpty() && nums2[stack.peek()] < nums2[i]) {
                result[stack.pop()] = nums2[i];
            }
            stack.push(i);
        }

        // Remaining elements in stack have no greater element
        while (!stack.isEmpty()) {
            result[stack.pop()] = -1;
        }
        int ans[] = new int[nums1.length];
        int p = 0;
        for(int i = 0;i< nums1.length;i++){
            ans[p++] = result[h.get(nums1[i])];
        }
return ans;
    }

}
//    public static int[] nextgreate(int arr[]){
////        int size = arr.length;
////        int n2[] = new int[size*2];
////        for(int i = 0;i<size;i++){
////            n2[i] = arr[i];
////        }
////        int j = size+1;
////        for(int i = 0;i<size;i++){
////            n2[j++] = arr[i];
////        }
////        int k = 0;
////        int newarr[]= new int[size];
////        Stack<Integer> st = new Stack<>();
////        for(int i=n2.length-1;i>=0;i--){
////            if(st.isEmpty()){
////                st.push(n2[i]);
////            }
////            if(st.peek()>n2[i]){
////                newarr[k++] = st.peek();
////            }
////            else{
////                newarr[k++] = -1;
////                st.pop();
////                st.push(arr[i]);
////            }
////        }
////reverse(newarr);
////        return newarr;
////    }



//}
