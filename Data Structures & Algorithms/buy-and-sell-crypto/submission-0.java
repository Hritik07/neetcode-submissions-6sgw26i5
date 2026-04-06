class Solution {
    public int maxProfit(int[] prices) {
        int minp = Integer.MAX_VALUE;
        int maxp = 0;
        for ( int price : prices){
            if (price < minp){
                minp = price;
            }
        
        else {
            int p = price - minp;
            maxp = Math.max(maxp,p);
        }
        }
        return maxp;
    }
}
