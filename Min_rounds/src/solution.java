import java.util.HashMap;
import java.util.Map;

public class solution {
	
	 public static int minimumRounds(int[] tasks) {
		 
		 HashMap<Integer,Integer> tasks_count = new HashMap<Integer,Integer>();
		 int count =0;
		 
		 for (int i=0; i<tasks.length;i++) {
			 
			 tasks_count.put(tasks[i], tasks_count.getOrDefault(tasks[i], 0)+1);
		 }
		 
		 for(Map.Entry<Integer, Integer> set: tasks_count.entrySet()) {
			 if (set.getValue() ==1) {
				 return -1;
				 
			 }
			 
			 if (set.getValue()%3==0) {
				 count += set.getValue()/3;
				 
			 }
			 
			 else {
				 count += set.getValue()/3+1;
				 
			 }
			 
			 
		 }
		 
		 return count ;
	        
	    }
	 
	 public static void main(String[] args) {
		
		 //int[] nums = {2,2,3,3,2,4,4,4,4,4};
		 int[] nums= {2,3,3};
		 
		 System.out.println(minimumRounds(nums));
	}

}
