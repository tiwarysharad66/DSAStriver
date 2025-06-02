import java.util.Arrays;

public class ques1SecondLargestElement {
    public static void main(String[] args) {
//        Arrays.sort(a);
//        return new int[]{a[n-2],a[1]}; brute force approach
        int[] arr = {3, 4, 5, 2,};
        System.out.println(Arrays.toString(getSecondOrderElements(4, arr)));
    }
    public static int[] getSecondOrderElements(int n, int []a) {
 if(n==0|| n==1){
     System.out.print(-1);
     System.out.print(" ");
     System.out.print(-1);
     System.out.print("\n");
 }
 int small = Integer.MAX_VALUE;
 int second_small = Integer.MAX_VALUE;
 int large = Integer.MIN_VALUE;
 int second_large = Integer.MIN_VALUE;
 for(int i =0;i<n;i++){
     small = Math.min(small,a[i]);
     large = Math.max(large,a[i]);
 }
 for(int i =0;i<n;i++){
    if(a[i]<second_small && a[i]!=small){
        second_small = a[i];
    }
     if(a[i]>second_small && a[i]!=large){
         second_large = a[i];
     }
 }
 return new int[]{second_large,second_small};
    }

}

