
/**
 * Invert a binary tree algorithm
 * 
 * @author Tim Fierek
 *
 */
public class InvertBinaryTree {
	
	public class Node{
		private int data;
		private Node left;
		private Node right;
		
		public Node(int data) {
			this.data = data;
		}
	}
	
	public static Node invertTree(Node root) {
		if(root == null) return root;
		
		Node left = invertTree(root.left);
		Node right = invertTree(root.right);
		
		root.right = left;
		root.left = right;
		
		return root;
	}
}
