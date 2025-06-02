package slidingwindow;
import java.util.Scanner;
public class Leetcode1343 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int k = s.nextInt();
        int threshold = s.nextInt();
        int[] arr = new int[size];
        for(int i =0;i<size;i++){
            arr[i] = s.nextInt();
        }
        System.out.println(numOfSubarrays(arr,k,threshold));
    }
    public static int numOfSubarrays(int[] arr, int k, int threshold) {
        int i = 0;
        int j =0;
        int size = arr.length;
        int count = 0;
        int sum = 0;
        while(j<size){
            sum+=arr[j];
            if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){
                if((sum/k>=threshold)){
                    count++;
                }
                sum-=arr[i];
                i++;
                j++;
            }
        }
        return count;
    }
}
