package selflearning;

public class CoinChange {
	public static void countWays(int coins[], int n) {
		int ways[] = new int[n + 1];
		
		ways[0] = 1;
		
		for(int i = 0; i < coins.length; i++) {
			for(int j = 0; j < ways.length; j++) {
				if(coins[i] <= j)
					ways[j] += ways[j - coins[i]];
			}
		}
		System.out.println(ways);
	}
	
	public static void main(String[] args) {
		int coins[] = {1, 5, 10};
		countWays(coins, 12);
	}
}
