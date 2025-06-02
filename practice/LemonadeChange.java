package practice;

public class LemonadeChange {
    public static void main(String[] args) {
    }
    public boolean lemonadeChange(int[] bills) {
        if(bills[0]!=5){
            return false;
        }
       int count1 = 0 ;
        int count2 = 0;
        for(int i = 0;i<bills.length;i++){
            if(bills[i]==5){
                count1++;
            }
            else if(bills[i]==10){
                count1--;
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }
        if(count1<0||count2<0){
            return false;
        }
        return true;
    }
}
