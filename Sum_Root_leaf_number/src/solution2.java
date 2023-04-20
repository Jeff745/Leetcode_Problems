import java.util.Stack;

public class solution2 {
	
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
	 
	 public static int sumNumbers(TreeNode root) {
		 
	
	    }
	 
	 
	 public int inOrder(TreeNode root) {
		 if (root ==null) {
			 return 0;	 
		 }
		 
		 int subtrees_right = root.val +inOrder(root.right);
		 int subtrees_left = root.val + inOrder(root.left);

		 
	 }

}
