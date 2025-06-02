package Arrays;

public class reverse_array_optimise {
    public static void main(String[] args) {
int[]arr = {2,4,6,8,10,12,14,16,18,20,22,24,26};
reverse(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void reverse(int[]arr){
        int n = arr.length;
       int start = 0;
       int end  = n-1;
       for(int i=0;i<n/2;i++){
           int temp = arr[start];
           arr[start] = arr[end];
           arr[end] = temp;
           start++;
           end--;
       }



    }
}
