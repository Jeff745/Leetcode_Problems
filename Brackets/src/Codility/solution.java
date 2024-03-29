package Codility;

import java.util.Arrays;
import java.util.Stack;

public class solution {
	
	public static int solution(String S) {
		
		Stack<Character> string_symbols = new Stack<Character>();
		
		char left_curly_brace='{';
		char right_curly_brace='}';
		char left_bracket='(';
		char right_bracket=')';
		char left_square_bracket='[';
		char right_square_bracket=']';

		Character[] strings = S.chars().mapToObj(c -> (char)c).toArray(Character[]::new);
		


		//
		for (int i=0; i< strings.length; i++) {
			
			if (string_symbols.empty()) {	
				
				string_symbols.push((char) i);
				
			}
			
			if (strings[i]==left_bracket) {
				
				string_symbols.push((char) i);
				
			}
			
			else if (string_symbols.contains(left_bracket)  && strings[i]==right_bracket ||string_symbols.peek()==left_bracket && strings[i]==right_bracket) {
				string_symbols.pop();
				
			}
			
			if (strings[i]==left_curly_brace) {
				
				string_symbols.push((char) i);
				
			}
			
			else if (string_symbols.contains(left_curly_brace) && string_symbols.contains(right_curly_brace)) {
				string_symbols.pop();
	
			}
			
			
			if (strings[i]==left_square_bracket) {
				
				string_symbols.push((char) i);
			}
			
			else if (string_symbols.contains(left_square_bracket) &&string_symbols.contains(right_square_bracket)) {
				string_symbols.pop();
				
			}	
			
		}
		
		if (string_symbols.isEmpty()) {
			
			return 1;
		}
		
		else {
			
			return 0;
		}
		
		
	}
	
	public static void main(String[] args) {
		
		String test = "{[()()]}";
		System.out.println(solution(test));
		
	}
	

}
