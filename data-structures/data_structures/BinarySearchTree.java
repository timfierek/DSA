package data_structures;

public class BinarySearchTree {
	
	private class TreeNode{
		private TreeNode left;
		private TreeNode right;
		private int data;
		
		public TreeNode(int num) {
			left = right = null;
			this.data = num;
		}
	}
	
	private TreeNode root;
	private int size;
	
	public BinarySearchTree() {
		root = null;
		size = 0;
	}
	
	public boolean insert(int num) {
		// If there is no root node
		if(root == null) {
			root = new TreeNode(num);
			size++;
			return true;
		}
		return insert(num, root);
	}
	
	private boolean insert(int num, TreeNode cur) {
		if(num < cur.data) {
			if(cur.left == null) {
				cur.left = new TreeNode(num);
				size++;
				return true;
			}
			else {
				return insert(num, cur.left);
			}
		}
		else if(num > cur.data) {
			if(cur.right == null) {
				cur.right = new TreeNode(num);
				size++;
				return true;
			}
			else {
				return insert(num, cur.right);
			}
		}
		
		// number is equal to an already existing node, cannot be added
		return false;
	}
	
	public boolean contains(int num) {
		return contains(num, root);
	}
	
	private boolean contains(int num, TreeNode cur) {
		if(cur.data == num) {
			return true;
		}
		else if(cur.data > num) {
			if(cur.left == null) {
				return false;
			}
			else {
				return contains(num, cur.left);
			}
		}
		else if(cur.data < num) {
			if(cur.right == null) {
				return false;
			}
			else {
				return contains(num, cur.right);
			}
		}
		return false;
	}
	
	public String inorderString() {
		StringBuilder b = new StringBuilder();
		return inorderString(b, root).trim();
	}
	
	public String inorderString(StringBuilder b, TreeNode cur) {
		if(cur == null) {
			return b.toString();
		}
		inorderString(b, cur.left);
		b.append(cur.data + " ");
		inorderString(b, cur.right);
		
		return b.toString();
	}
	
	public int getSize() {
		return size;
	}
}
