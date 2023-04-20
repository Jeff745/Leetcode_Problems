package leetcode;

public class solution {
	
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
	
		     static TreeNode createNode(int item) {
		    	 TreeNode temp = new TreeNode();
		    	 temp.val = item;
		    	 temp.left = temp.right =null;
		    	 
		    	 return temp;
			     
			     
		     }
		     
		     static TreeNode insert(TreeNode root,int key) {
		    	 
		    	 if (root==null) {
		    		 return createNode(key);
		    	 
		    	 }
		    	 
		    	 if (key <root.val) {
		    		 
		    	 root.left = insert(root.left, key);
		    	 }
		    	 
		    	 if (key > root.val) {
		    		 
			    	 root.right = insert(root.right, key);
			    }
		     
		     
		    	 
		    	return root; 
		    	 
		     }
		     
		     
			 public static int maxDepth(TreeNode root) {
				 int left_height =0;
				 int right_height =0;

				 if (root==null) {
					return 0;

				 }
				 
				 //hypotheses
				 left_height= maxDepth(root.left);
				 right_height = maxDepth(root.right);
				 
				 //induction
				 return Math.max(left_height, right_height)+1;
			 }
			        
			 

}
	
	public static void main(String[] args) {
		
		
	}
	
	
	}
