package leetcode;

import java.util.Arrays;

public class solution {
	
	 public static int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
		int[] diff_array = new int[capacity.length];  
		 int count =0;
		
		   for (int i=0; i<capacity.length;i++){
		          diff_array[i]=capacity[i]-rocks[i];
		   }
		   
           Arrays.sort(diff_array);
           for (int j=0; j<diff_array.length;j++) {
        	   if ( additionalRocks >= diff_array[j] ||diff_array[j]==0){
        		   additionalRocks-=diff_array[j];
        		     count++;       
        		   }

        	   else {
        		   break;
        	   }
        		             
        		                   
        		     }
           return count;  
         }

	
	 
	 public static void main(String[] args) {
		
//		 int[] capacity = {91,54,63,99,24,45,78};					
//		 int[] rocks = {35,32,45,98,6,1,25};
//		 int add_rocks = 17;
//		 
		 
//		 int[] capacity = {54,18,91,49,51,45,58,54,47,91,90,20,85,20,90,49,10,84,59,29,40,9,100,1,64,71,30,46,91};
//		 int[] rocks = {14,13,16,44,8,20,51,15,46,76,51,20,77,13,14,35,6,34,34,13,3,8,1,1,61,5,2,15,18};
//		 int add_rocks = 77;
		 
		 int[] capacity = {2,3,4,5};					
		 int[] rocks = {1,2,4,4};
		 int add_rocks = 2;
		 System.out.println(maximumBags(capacity, rocks, add_rocks));
		 
		 
		 
		 
	}

}
