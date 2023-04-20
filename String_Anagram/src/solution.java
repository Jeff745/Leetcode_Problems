import java.util.ArrayList;
import java.util.List;

public class solution {
	
	 public static List<Integer> findAnagrams(String s, String p) {
		 
		 List<Integer> final_anagrams = new ArrayList<>();
		 
		 int n= s.length();
		 int m= p.length();

		 int[] arr_s = new int[26];
		 int[] arr_p = new int[26];
		 
		 if (n<m) {
			 
			 return final_anagrams;
		 }
		 
		 for (int i=0; i<m;i++) {
			 arr_p[p.charAt(i)-'a']++;
			 arr_s[s.charAt(i)-'a']++;

		 }
		 
		 for (int j=0; j<= n-m;j++) {
			 if (isZero(arr_p, arr_s)) {
				 final_anagrams.add(j);
			 }
			 
			 arr_s[s.charAt(j)-'a']--;
			 if (j+m < n) {
				 arr_s[s.charAt(j+m)-'a']++;

				 
			 }
			 
		 }

		 return final_anagrams;
	        
	    }
	 
	 public static boolean isZero(int[] arr_p,int[] arr_s) {
		 
		 for (int i=0; i<26; i++) {
			 if (arr_p[i]!=arr_s[i]) {
				 return false;
			 }
			 
		 }
		 
		 return true;
		 
	 }
	 
	 public static void main(String[] args) {
		
		String s= "cbaebabacd";
		String p= "abc";
		System.out.println(findAnagrams(s, p));

	}

}
