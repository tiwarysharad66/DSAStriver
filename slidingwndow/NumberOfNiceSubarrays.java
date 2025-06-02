package slidingwndow;

public class NumberOfNiceSubarrays {
    public static void main(String[] args) {
int arr[] = {2,2,2,1,2,2,1,2,2,2};
        System.out.println(numberOfSubarrays(arr,2));
    }
    public  static int numberOfSubarrays(int[] nums, int k) {
int first = numberofKodd(nums,k);
int second = numberofKodds(nums,k-1);
return first-second;
    }
    public static int numberofKodd(int arr[],int k){
        int size = arr.length;
        int i = 0;
        int j = 0;
        int count = 0;
        int c = 0;
        while(j<size){
           if(arr[j]%2==1){
               count++;
           }
           if(count>k){
               while(count>k){
                   if(arr[i]%2==1){
                       count--;
                   }
                   i++;
               }
           }
           c+=j-i+1;
           j++;
        }
       return c;
    }
    public static int numberofKodds(int arr[],int k){
        int size = arr.length;
        int i = 0;
        int j = 0;

        int count = 0;
        int c = 0;
        while(j<size){
            if(arr[j]%2==1){
                count++;
            }
            if(count>k){
                while(count>k){
                    if(arr[i]%2==1){
                        count--;
                    }
                    i++;
                }
            }
            c+=j-i+1;
            j++;
        }
        return c;
    }
}
