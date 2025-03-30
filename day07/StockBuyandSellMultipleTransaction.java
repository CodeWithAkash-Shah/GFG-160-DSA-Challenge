package day07;

public class StockBuyandSellMultipleTransaction {
    public int maximumProfit(int prices[]) {
        // 1: The approach is to find the min and max in the array and subtract them for profit.
        //    But this won't work since the max price might come before the min.
        // 2: Instead, treat every day as a potential selling day and compare it with the previous day's min buy.
        // 3: Since we can buy and sell on the same day or wait for future opportunities, 
        //    summing up daily positive differences will yield the same result as deciding the best days manually.
    
        int len = prices.length; 
        int Profit = 0;          
    
        for (int i = 1; i < len; i++) { 
            if (prices[i] > prices[i - 1]) {
                Profit += prices[i] - prices[i - 1]; 
            }
        }
        return Profit;
    }
}
