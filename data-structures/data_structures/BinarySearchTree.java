package data_structures;

import java.util.LinkedList;

/**
 * Basic implementation of binary search tree. The left subtree of every parent node is less than the parent.
 * The right subtree of every parent is greater than the parent. This tree was not built to handle duplicate values.
 * Also includes depth first tree traversals (inorder, preorder, postorder), and a breadth first tree traversal.
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
	 * @TimeComplexity O(log n)
	 * @SpaceComplexity O(h) where h is the maximum depth of the tree 
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
	 * @TimeComplexity O(log n)
	 * @SpaceComplexity O(h) where h is the maximum depth of the tree 
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
	 * @TimeComplexity O(log n)
	 * @SpaceComplexity O(h) where h is the maximum depth of the tree 
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
	 * Calls an in order traversal on the tree
	 * 
	 * @return a String containing all elements of the tree in the in order traversal order
	 */
	public String inOrderString() {
		StringBuilder b = new StringBuilder();
		return inOrderString(b, root).trim();
	}
	
	/**
	 * Recursive helper method for inOrderString()
	 * 
	 * @param b the StringBuilder to store the result
	 * @param cur the currrent node
	 * @return the String containing all nodes in the tree
	 * @TimeComplexity O(n)
	 * @SpaceComplexity O(h) where h is the maximum height of the tree
	 */
	public String inOrderString(StringBuilder b, TreeNode cur) {
		//Base case
		if(cur == null) {
			return b.toString();
		}
		inOrderString(b, cur.left);
		b.append(cur.data + " ");
		inOrderString(b, cur.right);
		
		return b.toString();
	}
	
	/**
	 * Calls an pre order traversal on the tree
	 * 
	 * @return a String containing all elements of the tree in the pre order traversal order
	 */
	public String preOrderString() {
		StringBuilder b = new StringBuilder();
		return preOrderString(b, root).trim();
	}
	
	/**
	 * Recursive helper method for preOrderString()
	 * 
	 * @param b the StringBuilder to store the result
	 * @param cur the currrent node
	 * @return the String containing all nodes in the tree
	 * @TimeComplexity O(n)
	 * @SpaceComplexity O(h) where h is the maximum height of the tree
	 */
	public String preOrderString(StringBuilder b, TreeNode cur) {
		//Base case
		if(cur == null) {
			return b.toString();
		}
		
		b.append(cur.data + " ");
		preOrderString(b, cur.left);
		preOrderString(b, cur.right);
		
		return b.toString();
	}
	
	/**
	 * Calls an post order traversal on the tree
	 * 
	 * @return a String containing all elements of the tree in the post order traversal order
	 */
	public String postOrderString() {
		StringBuilder b = new StringBuilder();
		return postOrderString(b, root).trim();
	}
	
	/**
	 * Recursive helper method for postOrderString()
	 * 
	 * @param b the StringBuilder to store the result
	 * @param cur the currrent node
	 * @return the String containing all nodes in the tree
	 * @TimeComplexity O(n)
	 * @SpaceComplexity O(h) where h is the maximum height of the tree
	 */
	public String postOrderString(StringBuilder b, TreeNode cur) {
		//Base case
		if(cur == null) {
			return b.toString();
		}
		
		postOrderString(b, cur.left);
		postOrderString(b, cur.right);
		b.append(cur.data + " ");
		
		return b.toString();
	}
	
	/**
	 * Performs a breadth first traversal on the tree, returning the order in a space separated string
	 * 
	 * @return a String containing all of the elements of the tree in the breadth first traversal order
	 * @TimeComplexity O(n)
	 * @SpaceComplexity O(h) where h is the maximum height of the tree
	 */
	public String breadthFirstTraversal() {
		if(root == null) {
			return "";
		}
		
		TreeNode cur = root;
		StringBuilder result = new StringBuilder();
		LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(cur);
		
		while(!queue.isEmpty()) {
			cur = queue.remove();
			result.append(cur.data + " ");
			
			if(cur.left != null) queue.add(cur.left);
			if(cur.right != null) queue.add(cur.right);
		}
		
		return result.toString().trim();
	}
}
