public class Check_if_array_is_sorted {
    public static void main(String[] args) {
        int []arr  = {2,3,4,5,6};
        boolean x = sort(arr,arr.length);
        System.out.println(x);
    }
    public static boolean sort(int arr[],int n){
//        if(n==1|| n==0){
//            return true;
//        }
//        for(int i=0;i<n;i++){
//            for(int j = i+1;j<n;j++){
//                if(arr[i]>arr[j]){
//                    return false;
//                }
//            }
//        }
//        return true; brute force approach
        // optimal solution
     for(int i=1;i<n;i++){
         if(arr[i]<arr[i-1]){
             return false;
         }
     }
     return true;
    }
}
