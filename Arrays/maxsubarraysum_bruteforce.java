package Arrays;

public class maxsubarraysum_bruteforce {
    public static void main(String[] args) {
int arr[] = {1,-2,6,-1,3};
        System.out.println("the sum of maxsubarray is = " + maxsubarray(arr));
    }
    public static int maxsubarray(int[]arr){
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                currsum = 0;
                for(int k=i;k<=j;k++){
                    currsum+= arr[k];
                }
                System.out.print(currsum+ " ");
                if(currsum>maxsum){
                    maxsum = currsum;
                }
            }
        }
        return maxsum;
    }
}
