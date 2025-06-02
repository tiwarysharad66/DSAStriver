package recursion_practice;

import java.util.ArrayList;
import java.util.Arrays;

public class LL {
    public static void main(String[] args) {
        int arr[] = {3, 1};
        System.out.println(Arrays.toString(nodesBetweenCriticalPoint(arr)));
    }

    public static int[] nodesBetweenCriticalPoint(int arr[]) {
        int ans[] = {-1, -1};
        int size = arr.length;
        if (size <= 2) {
            return ans;
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i < size - 1; i++) {
            if (arr[i] > arr[i + 1] && arr[i] > arr[i - 1] || arr[i] < arr[i + 1] && arr[i] < arr[i - 1]) {
                list.add(i + 1);
            }
        }
        if (list.size() == 1) {

            return ans;
        }
        if (list.isEmpty()) {
            return ans;
        }
        int max = -1;
        max = list.getLast() - list.getFirst();
        ans[1] = max;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < list.size() - 1; i++) {
            min = Math.min(list.get(i + 1) - list.get(i), min);
        }
        ans[0] = min;
        return ans;
    }

}
