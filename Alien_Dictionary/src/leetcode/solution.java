package leetcode;

import java.util.HashMap;

public class solution {
	
	  public static boolean isAlienSorted(String[] words, String order) {
		
		HashMap<Character,Integer> letter_orders = new HashMap<>();
		
		for (int i=0; i< order.length();i++) {
			
			letter_orders.put(order.charAt(i), i);
			
		}
		
		for (int i=0; i< words.length; i++) {
			
			for (int j=0; j< words[i].length(); j++) {
				if (words[i].charAt(0)>=words[i+1].charAt(0)) {
					return true;
				}
				
			}
			
			
		}
		  
	        
	    }

}
