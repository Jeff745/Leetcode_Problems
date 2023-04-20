package remove_Duplicates;

import java.util.Stack;

public class solution {
	
	public static String removeDuplicates(String s) {
		
		Stack<Character> temp_chars = new Stack<Character>();
		char[] string_array= s.toCharArray();
		
		for (int i=0; i<string_array.length;i++) {
			
			if(temp_chars.empty() || !(temp_chars.peek()==string_array[i]) ) {
				temp_chars.push(string_array[i]);	
			}
			
			else if (temp_chars.peek()==string_array[i]) {
				temp_chars.pop();
								
			}
					
		}
		
		StringBuilder final_string = new StringBuilder();
		
		for(char c: temp_chars) {
			
			final_string.append(c);
		}
		
		
        return final_string.toString();
    }
	
	public static void main(String[] args) {
		
		String c = "aababaab";
		System.out.println(removeDuplicates(c));
	}

}
