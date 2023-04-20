package leetcode;

import java.util.Stack;

public class solution {
	
	 public static boolean validateStackSequences(int[] pushed, int[] popped) {
		 
		 int i=0;
		 
		 Stack<Integer> temp_stack = new Stack<>();
		 
		 for (int j=0; j<pushed.length;j++) {
			 temp_stack.push(pushed[j]);
			 
			 while (i<popped.length && !temp_stack.empty() && popped[i] == temp_stack.lastElement()) {
				 
				 temp_stack.pop();
				 i+=1;
				 
				 
			 }
			 
			 
		 }
		 
		 
		 
		return temp_stack.isEmpty(); 
	        
	    }
	 
	 public static void main(String[] args) {
		int[] pushed = {1,2,3,4,5};
		int[] popped = {4,3,5,1,2};
		
		System.out.println(validateStackSequences(pushed, popped));

	}

}
