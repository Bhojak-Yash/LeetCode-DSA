
public class Buy_Sell_Stock {
	public static int buy_sell(int sp[]) {
		int bp = Integer.MAX_VALUE;
		int maxProfit = 0;
		
		for(int i=0 ; i<sp.length ; i++) {
			if(bp < sp[i]) {	//Profit
				int profit = sp[i] - bp; //Today's Profit
				maxProfit = Math.max(maxProfit, profit);
			}else {
				bp = sp[i];
			}
		}
		return maxProfit;
	}
	
	public static void main(String[] args) {
		int sp[] = {7,1,5,3,6,4};
		int c = buy_sell(sp);
		System.out.println(c);
	}
}