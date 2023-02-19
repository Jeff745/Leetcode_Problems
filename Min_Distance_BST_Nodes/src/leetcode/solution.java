package leetcode;

public class solution {
	
	static int min = Integer.MAX_VALUE; //To infinity
	static TreeNode prev = null ; //No nodes initially
	
	TreeNode root;
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
	 
 	 void insert(int key) {root = insertRec(root,key);}

	 TreeNode insertRec(TreeNode root, int key) {
		 if (root ==null) {
			 root = new TreeNode(key);
			 return root;
			 
		 }
		 
		 else if (key < root.val) {
			 
			 root.left = insertRec(root.left, key);
			 
		 }
		 
		 else if (key > root.val) {
			 
			 root.right = insertRec(root.right, key);
			 
		 }
		 
		 
		return root; 
	 }
	 
	 public static int minDiffInBST(TreeNode root) {
		 
		 inOrder(root);

		 return min;
	        
	    }
	 
	 public static void inOrder(TreeNode root) {
		 
		 if (root == null) {
			 return;
		 }
		 
		 inOrder(root.left);
		 
		 if (prev != null) {
			 min = Math.min(min, root.val - prev.val); //compute current diff. If min is lesser than current diff, then update min value
			 
		 }
		 
		 prev = root; //change previous node to current node value
		 
		 inOrder(root.right);
		 
	 }

	 
	 public static void main(String[] args) {
		 
		 solution bst = new solution();
		 
		 bst.insert(4);
		 bst.insert(2);
		 bst.insert(6);
		 bst.insert(1);
		 bst.insert(3);
		 
		System.out.println(minDiffInBST(bst.root)); 

		 
		 
	}
}
