package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class solution {
	HashSet<List<Integer>> hash_Set = new HashSet<>();
	String temp;

	public static List<List<String>> partition(String s) {
		
		List<List<String>> result = new ArrayList<>();
		int length = s.length();
		boolean [][] dp = new boolean[length][length];
		dfs(result,s,0,new ArrayList<>(),dp);
		return result;
		
        
    }
	
	public static void dfs(List<List<String>> result,String s, int start,List<String> currentList, boolean[][] dp) {
		
		if (start >= s.length()) {
			result.add(new ArrayList<>(currentList));
		}
		
		for (int i= start; i<s.length();i++) {
			if (s.charAt(start) == s.charAt(i) && (i -start <=2 ||dp[start+1][i-1])) {
				dp[start][i] =true;
				currentList.add(s.substring(start,i+1));
				dfs(result,s,i+1,currentList,dp);
				currentList.remove(currentList.size()-1);
				
			}
			
		}
		
		
	}
	

	public static void main(String[] args) {
		
		String s = "aab";
		System.out.println(partition(s));
	}
}
	
	
