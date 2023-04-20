package capitalise_Words;

//Write a function to capitalise the first letter of each word of a sentence while ensuring the other letters in the word are in lower case. 
//Example: “i lOve tO solVe problems! 1 + 1 = TWO.” becomes “I Love To Solve Problems! 1 + 1 = Two.”.

public class words {
	
	public static String capitalise(String words) {
		
		String[] new_words = words.split(" ");
		String sentence= " ";
		
		for(String word : new_words)
		{
			String firstLetter= word.substring(0,1);
			String otherLetters = word.substring(1).toLowerCase();
			String firstLetter_Caps= firstLetter.toUpperCase();
			String final_words = firstLetter_Caps +otherLetters + " ";
			sentence= sentence.concat(final_words);
			
			System.out.println("New String : " + sentence);
			
		}
		
		return sentence;
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		capitalise("i lOve tO solVe problems! 1 + 1 = TWO.");
		
	}

}
