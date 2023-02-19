package leetcode;

public class solution {
	
	public static String gcdOfStrings(String str1, String str2) {
		
		int length1 = str1.length(), length2= str2.length();
		
		if (!(str1+str2).equals(str2+str1)) {
			
			return "";
		}
		
		while(length2!=0) {
			
			int temp = length2;
			length2 = length1%length2;
			length1= temp;
		}
		
		
		return str1.substring(0, length1);
		
	
        
    }
	
	public static void main(String[] args) {
		
		String a = "ABABAB";
		String b = "ABAB";
		
		System.out.println(gcdOfStrings(a, b));
	}

}
