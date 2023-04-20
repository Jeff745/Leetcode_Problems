import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class solution {
	
	List<Integer> stored_numbers;
	
	 public class TreeNode {
		     int val;
		      TreeNode left;
		     TreeNode right;
		      TreeNode() {}
		      TreeNode(int val) { this.val = val; }
		     TreeNode(int val, TreeNode left, TreeNode right) {
		          this.val = val;
		          this.left = left;
		          this.right = right;
		      }
		 }
	 
	 TreeNode insertrec(TreeNode root, int key) {
		 if (root ==null) {
			 root = new TreeNode(key);
			 
		 }
		 
		 else if (key< root.val) {
			 root.left = insertrec(root.left, key);
		 }
		 
		 else if (key > root.val) {
			 root.right = insertrec(root.right, key);
		 }
		 
	 }
	 
	 public int sumNumbers(TreeNode root) {
		 
		 stored_numbers = new LinkedList<>();
		 
		 if (root==null) {
			 return 0;

			 
		 }

		 	Stack<TreeNode> s_numbers = new Stack<TreeNode>();
	        TreeNode current = root;
	        
	        while(current!=null|| s_numbers.size()>0 ) {
	        	
	        	while(current!=null) {
	        		/* place pointer to a tree node on the stack
	        		before traversing the node's left subtree */
	        		s_numbers.push(current);
	        		current = current.left;
	        	}
	        	
	        	//Current must be null at this point
	        	current = s_numbers.pop();
	        	
	        	int number = Integer.parseInt(Integer.toString(current.val));
	        	stored_numbers.add(number);
	     
	        	current = current.right;
	        	

	        	
	        }
	        
	        int sum =0;
	        for (int i=0; i< stored_numbers.size(); i++) {
	        	
	        	sum += stored_numbers.get(i);
	        }
	        
	        return sum;
	    }

}
