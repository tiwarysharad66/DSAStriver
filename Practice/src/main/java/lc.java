import java.util.Arrays;

public class lc {
    public static void main(String[] args) {
       int arr[]  = {0,1,0,3,12};
        System.out.println(Arrays.toString(move(arr)));
    }
    public static int[]move(int arr[]){
        int size = arr.length;
        int count = 0;
        for(int i =0;i<size;i++){
            if(arr[i]==0){
                count++;
            }
        }
        int newans[] = new int[size];
        int j = 0;
        for(int num:arr){
          if(num!=0){
              newans[j++]=num;
          }

        }
        for(int i=j;i<size;i++){
            newans[i]=0;
        }
        return newans;
    }
}
