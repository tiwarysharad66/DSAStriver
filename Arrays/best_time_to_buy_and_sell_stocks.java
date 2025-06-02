package Arrays;

public class best_time_to_buy_and_sell_stocks {
    public static void main(String[] args) {

    }
    public static int buystocks(int[]prices){
        int n = prices.length;
        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        int profit = 0;
        for(int i=0;i<n;i++){
            if(buyprice<prices[i]){
                profit = prices[i]-buyprice;
                maxprofit = Math.max(profit,maxprofit);
            }
            if(buyprice>prices[i]){
                buyprice =prices[i];
            }

        }
        return maxprofit;
    }
}
