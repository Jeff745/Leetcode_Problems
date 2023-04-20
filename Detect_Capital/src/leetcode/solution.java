package leetcode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class solution {
		public static boolean detectCapitalUse(String word) {
			
		return word.matches("[A-Z]*|[a-z]*|[A-Z][a-z]*");
	    }
		
		public static void main(String[] args) {
			
			String testing = "USA";
			//String testing = "FlaG";

			System.out.println(detectCapitalUse(testing));
		}
	

}

//The pattern of case 1 in regex is [A-Z]*[A−Z]∗, where [A-Z][A−Z] matches one char from 'A' to 'Z', *∗ represents repeat the pattern before it at least 0 times. Therefore, this pattern represents "All capital".
//
//The pattern of case 2 in regex is [a-z]*[a−z]∗, where similarly, [a-z][a−z] matches one char from 'a' to 'z'. Therefore, this pattern represents "All not capital".
//
//Similarly, the pattern of case 3 in regex is [A-Z][a-z]*[A−Z][a−z]∗.
//
//Take these three pattern together, we have [A-Z]*|[a-z]*|[A-Z][a-z]*[A−Z]∗∣[a−z]∗∣[A−Z][a−z]∗, where "|" represents "or".
//
//Still, we can combine case 2 and case 3, and we get .[a-z]*.[a−z]∗, where "." can matches any char.
//
//Therefore, the final pattern is [A-Z]*|.[a-z]*[A−Z]∗∣.[a−z]∗.
