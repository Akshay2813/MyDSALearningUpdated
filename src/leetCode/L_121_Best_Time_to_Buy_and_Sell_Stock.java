package leetCode;

public class L_121_Best_Time_to_Buy_and_Sell_Stock {

	
	public static int maxProfit(int[] prices) {

        int max_profit=0;
        int min_buy=prices[0];
        for(int i=1; i<prices.length;i++)
        {
            int curr_profit = prices[i]-min_buy;
            if(curr_profit>max_profit)
            {
                max_profit=curr_profit;
            }
            if(prices[i]<min_buy)
            {
                min_buy=prices[i];
            }
           
        }
        return max_profit;

        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr= {7,1,5,3,6,4};
//		int ans =maxProfit(arr);
//		System.out.print(ans);
		

}}
