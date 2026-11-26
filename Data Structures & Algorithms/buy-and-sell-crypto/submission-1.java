class Solution {
    public int maxProfit(int[] prices) {
        int left=0, right=left+1;
        int profit=0;
        if(prices==null || prices.length<2){
            return profit;
        }
        while(right<prices.length){
            if(prices[right] <= prices[left]){
                left=right;
                right=left + 1;
            }else{
                profit=Math.max(profit, prices[right]-prices[left]);
                right=right+1;
            }
        }
        return profit;
    }
}
