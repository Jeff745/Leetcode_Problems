
public class solution {
	
	 public static int minFlipsMonoIncr(String s) {
		 
		 int oneCount=0 , flipCount=0;
		 
		 for (int i=0; i<s.length();i++) {
			 
			 if(s.charAt(i)=='1') {
				 oneCount++;
				 
			 }
			 
			 else {
				 flipCount = Math.min(oneCount, flipCount+1);
				 
			 }
			 
		 }
		 
		 return flipCount;
	        
	    }
	 
	 public static void main(String[] args) {
		
		// String temp = "00110";
	//	 String temp = "010110";
	 String temp = "0101100011";
		 
		 System.out.println(minFlipsMonoIncr(temp));

	}

}
