package day08;

public class StockBuySellMaxoneTransactionAllowed {
    
class Solution {
    public int maximumProfit(int prices[]) {
        // Code here
        int len = prices.length;
        int profit = 0;
        int bestday = prices[0];
        for(int i=1; i<len; i++){
            if(bestday<prices[i]){
                profit=Math.max(profit, prices[i]-bestday);
            }
            bestday=Math.min(bestday,prices[i]);
        }
        return profit;
    }
}
}
