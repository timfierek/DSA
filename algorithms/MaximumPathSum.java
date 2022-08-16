/**
 * Find the path from root to leaf of a tree that when summed up, yeilds the greatest value
 * 
 * @author Tim Fierek
 *
 */
public class MaximumPathSum {
	public static void main(String[] args) {
		MaximumPathSum tree = new MaximumPathSum();
		Node a = tree.new Node(3);
		Node b = tree.new Node(11);
		Node c = tree.new Node(4);
		Node d = tree.new Node(4);
		Node e = tree.new Node(-2);
		Node f = tree.new Node(1);
		
		a.left = b;
		a.right = c;
		b.left = d;
		b.right = e;
		c.right = f;
		
		System.out.println(maxPathSum(a)); // -> 18
	}
	
	public class Node{
		private int data;
		private Node left;
		private Node right;
		
		public Node(int data) {
			this.data = data;
		}
	}
	
	public static int maxPathSum(Node root) {
		if(root == null) return Integer.MIN_VALUE;
		if(root.left == null && root.right == null) return root.data;
		
		int maxChildPathSum = Math.max(maxPathSum(root.left), maxPathSum(root.right));
		
		return root.data + maxChildPathSum;
	}
	
	
}
