package stack2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Number_Of_Nges_toRight {
    public static void main(String[] args) {
int arr[] = {1,2,3,4,1};
int queries = 2;
int indices[] = {0,3};
        System.out.println(Arrays.toString(count_NGEs(8, arr, 2, indices)));

    }
    public static int[] count_NGEs(int N, int arr[], int queries, int indices[]) {
        int size = arr.length;
        int j = queries-1;
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        Stack<Integer> st = new Stack<>();
        for(int i = size-1;i>=0;i--) {
            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }

            if (!st.isEmpty() && st.peek() > arr[i]) {
                count++;
                if (i == indices[j]) {
                    list.add(count);
//                    count = 0;
                    j--;
                    if (j < 0) {
                        break;
                    }
                }
            }
            st.push(arr[i]);
        }
int newarr[] = new int[queries];
        int l = 0;
        for(int k =list.size()-1;k>=0;k--){
            newarr[l++] = list.get(k);
        }
        return newarr;
    }
}
