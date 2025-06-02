public class FarthestGreaterElement {
    public static int maxProfit(int[] prices) {
int size = prices.length;
int fge[] = farthestGreaterElement(prices);
int max = Integer.MIN_VALUE;
for(int i = 0; i < size - 1; i++) {
    max =Math.max(fge[i]-prices[i],max);
}
return max;
    }
    public static int[] farthestGreaterElement(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        int maxRight = -1; // Initialize the maximum element to the right as -1
         result[arr.length-1] = -1;
         if(arr[n-1]>arr[n-2]){
             maxRight = arr[n-1];
         }
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i]>maxRight&&i==0) {
                result[i] = -1;
                break;
            }
              if(arr[i] > maxRight) {
                  maxRight = arr[i];
              }
              if(arr[n-2]>arr[n-1]&&i==n-2){
                  result[i] = -1;
              } else if (arr[i] == maxRight) {
                  result[i] = -1;
              }
                  else{
                      result[i] = maxRight;
                  }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        int[] result = farthestGreaterElement(arr);

        // Print the result
        System.out.print("Farthest Greater Elements: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
        int ans = maxProfit(arr);
        System.out.println(ans);
    }
}
