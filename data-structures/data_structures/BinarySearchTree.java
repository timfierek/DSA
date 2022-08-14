package data_structures;

import data_structures.BinarySearchTree.TreeNode;

/**
 * Basic implementation of binary search tree. The left subtree of every parent node is less than the parent.
 * The right subtree of every parent is greater than the parent. This tree was not built to handle duplicate values.
 * 
 * @author Tim Fierek
 *
 */
public class BinarySearchTree {
	
	/**
	 * Nested node class to store references to the left and right subtrees, also stores the data of the node.
	 */
	public class TreeNode{
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
	
	/**
	 * Public accessible method which simply makes a call to the recursive method
	 * 
	 * @param num number to be inserted to the tree
	 * @return true if number is inserted to the tree, false if number already exists
	 */
	public boolean insert(int num) {
		// If there is no root node
		if(root == null) {
			root = new TreeNode(num);
			size++;
			return true;
		}
		return insert(num, root);
	}
	
	/**
	 * Helper/recursive method for insert(num) method which is public
	 * 
	 * @param num number to be inserted to the tree
	 * @param cur current tree node being observed in the call stack 
	 * @return true if number is inserted to the tree, false if number already exists
	 */
	private boolean insert(int num, TreeNode cur) {
		// If num is less than current node, traverse the left subtree to find a spot
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
		// If num is greater than current node, traverse the right subtree to find a spot
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
	
	/**
	 * Simple finder method to search the tree for num
	 * 
	 * @param num the value being searched for
	 * @return true if num exists in the tree, false otherwise
	 */
	public boolean contains(int num) {
		return contains(num, root);
	}
	
	/**
	 * Recursive helper method for contains(int num) method
	 * 
	 * @param num the num being searched for
	 * @param cur the current node being compared to num
	 * @return true if num exists in the tree, false otherwise
	 */
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
	
	/**
	 * Find out how many numbers are in the tree
	 * @return the number of numbers in the tree
	 */
	public int getSize() {
		return size;
	}
	
	/**
	 * Calls an inorder traversal on the tree
	 * 
	 * @return a String containing all elements of the tree in the inorder traversal order
	 */
	public String inorderString() {
		StringBuilder b = new StringBuilder();
		return inorderString(b, root).trim();
	}
	
	/**
	 * Recursive helper method for inorderString()
	 * 
	 * @param b the StringBuilder to store the result
	 * @param cur the currrent node
	 * @return the String containing all nodes in the tree
	 */
	public String inorderString(StringBuilder b, TreeNode cur) {
		if(cur == null) {
			return b.toString();
		}
		inorderString(b, cur.left);
		b.append(cur.data + " ");
		inorderString(b, cur.right);
		
		return b.toString();
	}
}
