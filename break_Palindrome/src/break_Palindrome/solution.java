package break_Palindrome;

import java.util.HashMap;

public class solution {
	
	public static String breakPalindrome(String palindrome) {
		
		char[] palin = palindrome.toCharArray();
		HashMap<Character,Integer> letters = new HashMap<>();
		
		for (char ch='a'; ch<='z'; ++ch) {
			letters.put(ch, 0);	
		}
		
		for (int j=0; j<palin.length; j++) {
			int k= letters.get(palin[j]);
			palin[j]= (char)k;
			
		}
		
		
		
		return null;   
    }

}
