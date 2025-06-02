public class maxsumsecondsmallsmall {
    public static void main(String[] args) {

    }
    public static int pairWithMaxSum(int arr[]) {
           int size = arr.length;
                   int max = Integer.MIN_VALUE;

           for(int i=0;i<size;i++){
               int secondsmall = Integer.MAX_VALUE;
               int small = Integer.MAX_VALUE;
               for(int j=i+1;j<size;j++){
                   if(arr[j]<small){
                       small = arr[j];
                       secondsmall =arr[i];
                   }
                   if(arr[j]<secondsmall){
                         secondsmall = arr[j];
                   }
                  /* else if(arr[j]<secondsmall){
                       secondsmall = arr[j];
                   }*/
                   max = Math.max(secondsmall+small,max);
               }
           }
           return max;
    }
}
