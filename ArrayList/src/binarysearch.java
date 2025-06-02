public class binarysearch {
    public static void main(String[] args) {
        int []arr = {2,3,4,15,16,18,19,20,24,25,27};
        int target = 25;
        int ans = binary(arr,target);
        System.out.println(ans);
    }
    //return index
    //return -1 if element not exist
    static int binary(int arr[],int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
//            int middle = (start+end)/2;// might be possible that start+end/2 gives a very large number that exceed int range and  will give error
            int mid = start+(end-start)/2;
            if(target<arr[mid]){
                end = mid-1;
            }
             else if (target>arr[mid]) {
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return  -1;

    }
    }

