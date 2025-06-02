package Arrays;

public class printsubarrays {
    public static void main(String[] args) {
int arr[] = {2,4,6,8,10};
subarray(arr);

    }
    public static void subarray(int []arr){
        int sum=0;
        int count=0;
        int maxsum = Integer.MIN_VALUE;
        int minsum = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                sum=0;
                for(int k =i;k<=j;k++){
                    sum+=arr[k];
                    if(sum>maxsum){
                        maxsum = sum;
                    }
                    if(sum<minsum){
                        minsum = sum;
                    }
                    System.out.print(arr[k]+ " ");
                }count++;
                System.out.println("the sum of above subarray " + sum);
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("the value of maxsum is : " + maxsum + " the value of minsum"+ minsum );
        System.out.println( "total subarrays = " + count);

    }

}
