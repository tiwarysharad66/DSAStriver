package Arrays;

import java.util.Scanner;

public class linearsearch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int target  = 22;
        int arr[] = new int[n];
        String arr2[] = {"samosa","bread","aloo"};
        String target2 = "samosa";
        for(int i=0;i<arr.length;i++){
            arr[i] = s.nextInt();
        }
        int index  = linear(arr,target);
        if(index==-1){
            System.out.println("element not found ");
        }
        else{
            System.out.println("index of element is " + index);
        }
        System.out.println(linearr(arr2,target2));

    }
    public static String linearr(String arr[],String target){
        for(int i=0;i<arr.length;i++){
        if(arr[i]==target){
            return "found";
        }
    }
        return "not found";
}
    public static int linear(int []arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
