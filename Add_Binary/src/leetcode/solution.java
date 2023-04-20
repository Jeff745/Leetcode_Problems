package leetcode;

import java.math.BigInteger;

public class solution {
	
	 public static String addBinary(String a, String b) {
		 
		 String temp = "0b";
		 a = temp.concat(a);
		 b = temp.concat(b);
		 BigInteger temp_a = new BigInteger(a.substring(2),2);
		 BigInteger temp_b = new BigInteger(b.substring(2),2);
		 BigInteger temp_c = temp_a.add(temp_b);
		 String ans = temp_c.toString(2);
	
		 return ans;
	        
	    }
	 
//	 public static int convertString(String a) {
//		 
//		 StringBuilder result = new StringBuilder();
//		 char[] chars = a.toCharArray();
//		 
//		 for (char achar :chars) {
//			 
//			 result.append(String.format("%8s", Integer.toBinaryString(achar))
//					 .replaceAll(" ", "0"));
//		 }
//		 
//		 
//		 
//	 }
	 
	 public static void main(String[] args) {
		
//		 String a="10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101";
//		String b= "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011";
		 String a="1010";
		 String b="1011";

		 System.out.println(addBinary(a, b));

	}

}
