package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class solution {
	
	public static String freQuencySort(String s) {
		
		char[] string_split = s.toCharArray();
		HashMap<Character,Integer> char_count  = new HashMap<>();
		
		for (int i =0 ; i <string_split.length ; i++) {
			char_count.put(string_split[i], char_count.getOrDefault(string_split[i], 0) + 1);
			
		}
		
		// Using keySet() to get the set view of keys

		List<Character> list = new ArrayList<>(char_count.keySet());
		Collections.sort(list,(a,b) ->(char_count.get(b) - char_count.get(a)));
		
		StringBuilder sb = new StringBuilder();
		
		for (Character c: list) {
			
			for (int j = 0; j<char_count.get(c); j++) {
				
				sb.append(c);
				
			}
			
		}
		
		String final_string = sb.toString();
		
		return final_string;
	}
	
	public static void main(String[] args) {
		
		//String test ="tree";
		String test = "cccaaa";
		System.out.println(freQuencySort(test));
		
	}

}
