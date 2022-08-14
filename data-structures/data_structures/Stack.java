package data_structures;

public class Stack<E> {
	
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
