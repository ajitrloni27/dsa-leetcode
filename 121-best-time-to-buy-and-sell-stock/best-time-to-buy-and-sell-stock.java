class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit =0;
        int buy= prices[0];
        for(int i =1; i< prices.length; i++){
           if(prices [i] < buy){
                buy= prices[i];
            }
           int profit = prices[i] - buy;
            if(maxprofit < profit){
                maxprofit = profit;
        }
        }
    return maxprofit;
    }
}