package BinarySearch;

public class SearchInsertPosition {
    public static void main(String[] args) {
int arr[] = {1,3,5,6};
        System.out.println(searchInsert(arr,2));
    }
    public static int searchInsert(int[] nums, int target) {
int size = nums.length;
int low = 0;
int high = size-1;
while(low<=high){
    int mid = (low+high)/2;
    if(nums[mid] == target){
        return mid;
    }
    else if(nums[mid]>target){
        high = mid-1;
    }
    else{
        low = mid+1;
    }
}
return low;
    }
}
