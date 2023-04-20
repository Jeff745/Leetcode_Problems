package leetcode;

public class solution {
	
	public static int findJudge(int n, int[][] trust) {
		
		if (n==1 || trust.length ==0) {
			return 1;
		}
		
		int[] count = new int[n+1];
		
		
		for(int[] person:trust) {
			count[person[0]]--;
			count[person[1]]++;

			
		}
		
		for (int k=0; k< count.length; k++) {
			if (count[k]== n-1) {
				return k;
			}
			
		}
		
		return -1;
     
    }
	
	public static void main(String[] args) {
		int n= 2;
		//int[][] trust = {{1,2}};
		int[][] trust = {};
		//int[][] trust = {{1,3},{2,3}};
		System.out.println(findJudge(n, trust));		
		
	}

}
