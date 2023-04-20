package pangram;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

//Check if Sentence is Pangram

public class solution {
	
	public static boolean checkIfPangram(String sentence) {
		
		//Use java Instream, Convert sentence to Characters,collect to a set. Thereafter, count the size of set. 
		int size =sentence.chars().mapToObj(chr ->(char) chr).collect(Collectors.toSet()).size();
		
		if (size>=26) {
			return true;
			
		}
		
		else {
			return false;
			
		}
		
    }
	
	
	public static void main(String[] args) {
		String sentence = "thequickbrownfoxjumpsoverthelazydog";
		System.out.println(checkIfPangram(sentence));
		
	}

}
