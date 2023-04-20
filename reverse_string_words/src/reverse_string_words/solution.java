package reverse_string_words;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class solution {
	
		public static String reverseWords(String s) {
		//String test_string= s.trim().replaceAll("\\s+", " ");
			String[] splitted_words= s.trim().replaceAll("\\s+", " ").split("\\s+");
	
			
			Collections.reverse(Arrays.asList(splitted_words));

			return String.join(" ", splitted_words);
        
    }
		
		public static void main(String[] args) {
			
			String test = "  hello world  ";
			System.out.println(reverseWords(test));
			
			
		}

}
