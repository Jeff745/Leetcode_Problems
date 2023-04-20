package leetcode;

import java.util.Arrays;

public class solution {
	
	 public static int bestTeamScore(int[] scores, int[] ages) {
		 int n = ages.length;
		 int[][] ageScorePair = new int[n][2];
		 
		 
		 for (int i=0; i<n;i++) {
			 ageScorePair[i][0]=ages[i];
			 ageScorePair[i][1]=scores[i];
			 
		 }
		 
		 Arrays.sort(ageScorePair, (a,b) -> a[0]==b[0] ? a[1]-b[1]:a[0]-b[0]);
		 
		 return findMaxScore(ageScorePair);
	        
	    }
	 
	 public static int findMaxScore(int[][] ageScorePair) {
		 
		 int s = ageScorePair.length;
		 int ans = 0;
		 int[] dp = new int[s];
		 
		 for (int i=0; i<s ; i++) {
			 
			 dp[i] = ageScorePair[i][1];
			 ans = Math.max(ans, dp[i]);

			 
		 }
		 
		 for(int i=0; i<s;i++) {
			 
			 for(int j=i-1; j>=0;j--) {
				 
				 if (ageScorePair[i][1]>=ageScorePair[j][1]) {
					 
					 dp[i] = Math.max(dp[i], ageScorePair[i][1]+dp[j]);
				 }
				 
			 }
			 
			 ans = Math.max(ans,dp[i]);
		 }
		 
		 return ans;
		 
	 }
	 
	 public static void main(String[] args) {
		int[] scores = {1,3,5,10,15};
		int[] ages = {1,2,3,4,5};
		
		System.out.println(bestTeamScore(scores, ages));

	}

}
