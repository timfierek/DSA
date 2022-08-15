package data_structures;

/**
 * Classic stack implementation with basic functionality.
 * Uses linked list style implementation
 * 
 * @author Tim Fierek
 *
 * @param <E> type to be stored by stack
 */
public class Stack<E> {
	
	/**
	 * Private Node class to store data and reference to next item
	 */
	private class Node{
		private Node next;
		private E data;
		
		public Node(E data) {
			this.data = data;
			next = null;
		}
	}
	
	private Node top;
	private int size;
	
	public Stack() {
		top = null;
		size = 0;
	}
	
	/**
	 * Add an item to the top of the stack
	 * 
	 * @param data value to be added to the stack
	 * @TimeComplexity O(1)
	 */
	public void push(E data) {
		if(top == null) {
			top = new Node(data);
		}
		else {
			Node oldTop = top;
			top = new Node(data);
			top.next = oldTop;
		}
		
		size++;
	}
	
	/**
	 * Removes and returns the item on the top of the stack
	 * @return the item on the top of the stack
	 * @TimeComplexity O(1)
	 */
	public E pop() {
		if(size == 0) {
			return null;
		}
		else {
			E data = top.data;
			top = top.next;
			size--;
			return data;
		}
	}
	
	/**
	 * Returns without removing the item on top of the stack
	 * @return the value of the item on top of the stack
	 */
	public E peek() {
		if(size == 0) {
			return null;
		}
		else {
			return top.data;
		}
	}
	
	public int getSize() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	@Override
	public String toString() {
		String result = "Stack[";
		Node cur = top;
		
		while(cur != null) {
			result += (cur.data);
			if(cur.next != null) {
				result += ",";
			}
			cur = cur.next;
		}
		result += "]";
		return result;
	}
}
