package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
	
	 public List<List<Integer>> threeSum(int[] nums) {
		 
		 List<Integer> neg_num = new ArrayList<Integer>();
		 List<Integer> pos_num = new ArrayList<Integer>();
		 List<Integer>zeroes = new ArrayList<Integer>();
		 ArrayList<List<Integer>> final_ans = new ArrayList<List<Integer>>();

		 for( int i= 0 ; i< nums.length ; i++) {
			 
			 if(nums[i]<0) {
				 
				 neg_num.add(nums[i]);
				 Collections.sort(neg_num);
				 			 
			 }
			 
			 else if(nums[i]>0) {
				 
				 pos_num.add(nums[i]);
				 Collections.sort(pos_num);

				 			 
			 }
			 
			 else if(nums[i] == 0) {
				 
				 zeroes.add(nums[i]);
				 			 
			 }		 
		}
		 
		 
		 
		 
		 for( int j=0; j<neg_num.size(); j++ ) {
			 int x = Math.abs(neg_num.get(j));
			 int k = neg_num.size()-1;
			 int y =Math.abs(neg_num.get(k));
			 
			 if(pos_num.contains(x)) {
				 if(!zeroes.isEmpty()) {
					 final_ans.get(j).add(x);
					 final_ans.get(j).add(neg_num.get(j));
					 final_ans.get(j).add(zeroes.get(j));
					 zeroes.remove(j); 
				 }				 				 
				 
			 }
				 
			 
		 }
		 
		 
		 
	     return null;   
	}

}
