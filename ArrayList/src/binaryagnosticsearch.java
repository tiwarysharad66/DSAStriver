public class binaryagnosticsearch {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 8};
        int [] arr2 = {90,78,67,56,43,22,21};
        int target =  2;
        System.out.println(binarysearch(arr,target));

    }
    static int binarysearch(int arr[],int target){
        int start = 0;
        int end = arr.length-1;
            boolean order = arr[start]<arr[end];
            while(start<=end){
//            int middle = (start+end)/2;// might be possible that start+end/2 gives a very large number that exceed int range and  will give error
                int mid = start+(end-start)/2;
                if(arr[mid]==target){
                    return mid;
                }
                if(order) {
                    if (target < arr[mid]) {
                        end = mid - 1;
                    } else if (target > arr[mid]) {
                        start = mid + 1;
                    }
                }
                else{
                    if (target < arr[mid]) {
                        start = mid + 1;
                    } else if (target > arr[mid]) {
                        end = mid - 1;
                    }
                }

            }
            return  -1;
        }

}
