
public class solution {
	
	public static String convert(String s, int numRows) {
	        if (numRows ==1 || s.length() < numRows) {
	        	
	        	return s;
	        }
	        
	        StringBuilder final_ans = new StringBuilder();
	        
	        int increment = (numRows - 1) *2;
	        
	        for (int i=0; i< numRows; i++) {
	        	
	        	int index = i; 
	        	
	        	while (index < s.length()) {
	        		final_ans.append(s.charAt(index));
	        		
	        		if (i!=0 && i!=numRows -1) {
	        			
	        			int diag_diff = increment -2 *1;
	        			int second_index = index + diag_diff;
	        			
	        			if (second_index < s.length()) {
	        				
	        				final_ans.append(s.charAt(second_index));
	        			}
	        			
	        		}
	        		
	        		
	        	}
	        		
	        	}
	        	
	        	
	        	
	        }
		
	    }

}
