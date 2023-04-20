package Leetcode;

import java.util.Arrays;
import java.util.stream.Stream;

public class solution {
	
	 public static int[] solution(int N, int[] A) {
		 
		 int[] counter_array= new int[N];
		 Arrays.fill(counter_array, 0);  
		 int max_counter = 0;
		 
		 for (int i = 0; i<A.length; i++) {
			 
			 //If array value is greater than N, all counters will be set to the maximum value of any counter
			 if (A[i] >= N) {
				 
				 Arrays.fill(counter_array, max_counter);
				 
			 }
			 
			 else {
				 
				 //counter array at index of A[i-1] is increased.
				 counter_array[A[i]-1]++;
				 
				 //Max counter is equals to the latest value of counter_array set
				 max_counter=counter_array[A[i]-1];
				 
				 
			 }
			 

			 
		 }
		 
		 
	return counter_array;	 
				 
	 }
	 
	 
	 public static void main(String[] args) {
		 
		 int[] nums= {3,4,4,6,1,4,4};
		 solution(5,nums);
		Arrays.stream(solution(5,nums)).forEach(System.out::print);
		
	}

}
