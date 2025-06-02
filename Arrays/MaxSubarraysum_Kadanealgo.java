package Arrays;

public class MaxSubarraysum_Kadanealgo {
    public static void main(String[] args) {
        int arr[] = {4,5,0,-2,-3,-1};
        System.out.println(maxsubarray(arr));

    }

    public static int maxsubarray(int[] arr) {
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            cs += arr[i];
            ms = Math.max(cs, ms);
            if (cs < 0) {
                cs = 0;
            }
        }
        return ms;
    }
}
//        if(ms==0){
//            int small = Integer.MAX_VALUE;
//            for(int i=0;i<arr.length;i++){
//              small = Math.min(small,arr[i]);
//            }
//            return small;
//        }

//    this not require if we first take math.max in line 14 before line15 if condition



