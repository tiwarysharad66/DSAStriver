public class target {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int target = 5;
        int x[] = target1(arr, target);

        for (int y : x) {
            System.out.print(y + ",");
        }
    }

    public static int[] target1(int[] arr, int target) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] + arr[i + 1] == target) {
                return new int[]{i, i + 1};
            }
        }

        return new int[]{-1};
    }
}

