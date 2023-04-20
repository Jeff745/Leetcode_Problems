package leetcode;

import java.util.HashMap;

public class solution {
	
	public static boolean wordPattern(String pattern, String s) {
		
		HashMap<Character,String> pattern_table = new HashMap<Character,String>();
		HashMap<String,Character> s_table = new HashMap<String,Character>();

		String[] s_key_values = s.split(" ");
		
		if(s_key_values.length!=pattern.length()) {
			return false;
			
		}
		
		for (int i=0; i<pattern.length();i++) {
			
			char c= pattern.charAt(i);
			String str = s_key_values[i];
			
			if (!pattern_table.containsKey(c)) {
			
					pattern_table.put(c, str);

				}
								
			
			
			 if (!s_table.containsKey(str)) {
				 
				
					 s_table.put(str, c);
				 
				
			}
			 
			 if (!pattern_table.get(c).equals(str)|| !s_table.get(str).equals(c)) {
				 
				 return false;
			 }
			
			
		}
        
		return true;
    }
	
	public static void main(String[] args) {
		
		String pattern= "abba";
		//String s = "dog cat cat";
		String s = "dog cat cat fish";

		System.out.println(wordPattern(pattern, s));
		
		
	}

}
