import java.util.Arrays;
import java.util.stream.IntStream;

public class solution {
	
	 public static int maxProfit(int[] prices) {
		 
		 int min_price = Integer.MAX_VALUE;
		 int selling_price =0;
		 
		 for (int i=0; i<prices.length;i++) {
			 min_price = Math.min(min_price, prices[i]);			 
			 selling_price = Math.max(selling_price, prices[i]-min_price);
			 
		 }
	        
		 return selling_price;
 }
	 
	 
	 public static void main(String[] args) {
		
		 int[] prices = {7,1,5,3,6,4};
		// int[] prices = {7,6,4,3,1};
		// int[] prices = {2,4,1};

		 
		 System.out.println(maxProfit(prices));
		 
	}

}
