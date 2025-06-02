package stack2;

import java.util.Stack;

public class NextGreater_Element01 {
    public static void main(String[] args) {
int nums1[] = {4,1,2};
int nums2[] = {1,3,4,2};
        System.out.println(nextGreaterElement(nums1,nums2).toString());
    }
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        int arr[]= new int[nums1.length];
        int k = 0;
        while(i<nums1.length){
            if(nums1[i]==nums2[j]){
                Stack<Integer>st = new Stack<>();
                st.push(nums2[j]);
                if(j==nums2.length-1){
                    arr[k++] = nums2[j];
                }
                else{
                    while(j<nums2.length){
                        if(st.peek()<nums2[j]){
                            st.pop();
                            st.push(nums2[j]);
                            break;
                        }
                        j++;
                        arr[k++] = st.peek();
                    }
                }
                i++;
            }
        }
return arr;
    }
}
