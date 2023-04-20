package two_array_strings_equal;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class solution {

	/**
	 * @param word1
	 * @param word2
	 * @return
	 */
	public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
       
		String word_1= Stream.of(word1)
				.map(arr -> new String(arr))
				.collect(Collectors.joining());	
		
		String word_2= Stream.of(word2)
				.map(arr -> new String(arr))
				.collect(Collectors.joining());
		
        if (word_1.compareTo(word_2) == 0){
        	return true;
        }
        
        else 
        {
        	return false;

        	
        }        
        
    }
	
	
	
	public static void main(String[] args) {
		
		String[] word1= {"ab", "c"};
		String[] word2= {"a", "bc"};
		System.out.println(arrayStringsAreEqual(word1, word2));
		
		
	}
	
}
