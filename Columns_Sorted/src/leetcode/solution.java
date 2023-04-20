package leetcode;

public class solution {
	
	 public static int minDeletionSize(String[] strs) {
		 
		 int deletions = 0;
		 
		 if (strs.length==0 ||strs==null) return 0;
		 
		 for (int i=0; i< strs[0].length(); i++) {
			 char c= strs[0].charAt(i);
			 
			 for (int j=0;j<strs.length;j++) {
				 if (strs[j].charAt(i)<c) {
					 deletions++;
					 break;
					 
				 }
				 
				 c = strs[j].charAt(i);
				 
			 }
			 
			 
		 }
		 
	     return deletions;   
	    }
	 
	 public static void main(String[] args) {
		
		 //String[] strs= {"abc","bce","cae"};
		 String[] strs= {"cba","daf","ghi"};

		 
		 System.out.println(minDeletionSize(strs));
		 
	}

}
