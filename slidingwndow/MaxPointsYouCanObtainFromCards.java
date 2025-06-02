package slidingwndow;

public class MaxPointsYouCanObtainFromCards {
    public static void main(String[] args) {
        int arr[] = {1, 79, 80, 1, 1, 1, 200, 1};
        System.out.println(maxScore(arr, 3));
    }

    public static int maxScore(int[] arr, int k) {
        if (k > arr.length) {
            return 0;
        }
        if (k == arr.length) {
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
            }
            return sum;
        }
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int i = 0;
        while (i < k) {
            sum += arr[i];
            i++;
        }
        i = k-1;
        int j = arr.length - 1;
        max = Math.max(sum, max);
        while (i >= 0) {
            sum += arr[j];
            sum -= arr[i];
            max = Math.max(sum, max);
            j--;
            i--;
        }
        return max;
    }
}
