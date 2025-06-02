public class ceilingofnumber {
    public static void main(String[] args) {
        int arr[] = {2,3,5,9,14,16,18};
        int target = 17;
        System.out.println(ceil(arr,target));
    }
    static int ceil(int []arr,int target){
        int start =0;
        int end = arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==target){
                return target;
            }
            else if(arr[mid]<target){
                start = mid+1;
            }
        }
       return start;
    }
}
