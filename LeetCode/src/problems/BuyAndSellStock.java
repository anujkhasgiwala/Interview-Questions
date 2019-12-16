package problems;

public class BuyAndSellStock {
	public static int maxProfit(int[] prices) {
		int min = Integer.MAX_VALUE, maxProfit = 0;
		for(int i = 0; i < prices.length; i++) {
			if(min > prices[i])
				min = prices[i];
			else if(prices[i] - min > maxProfit)
				maxProfit = prices[i] - min;
		}
		
		return maxProfit;
	}
	
	public static void main(String[] args) {
		int prices[] = {7,1,5,3,6,4};
		maxProfit(prices);
	}
}
