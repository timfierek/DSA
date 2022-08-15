package data_structures;

/**
 * Basic implementation of a queue using a linked list style approach
 * 
 * @author Tim Fierek
 *
 * @param <E> data type to be stored in queue
 */
public class Queue<E>{
	
	private class Node{
		private Node next;
		private E data;
		
		public Node(E data) {
			this.data = data;
			next = null;
		}
	}
	
	private Node head;
	private Node tail;
	private int size;
	
	public Queue() {
		head = null;
		tail = null;
		size = 0;
	}
	
	/**
	 * Add an item to the back of the queue
	 * @param data value to be enqueued
	 */
	public void enqueue(E data) {
		if(size == 0) {
			Node newNode = new Node(data);
			head = newNode;
			tail = newNode;
		}
		else {
			Node oldTail = tail;
			tail = new Node(data);
			oldTail.next = tail;
		}
		size++;
	}
	
	/**
	 * Remove the first item in the queue
	 * @return the data value removed from the front of the queue
	 */
	public E dequeue() {
		if(size > 0) {
			Node oldHead = head;
			head = oldHead.next;
			size--;
			return oldHead.data;
		}
		else {
			return null;
		}
		
	}
	
	/**
	 * Retrieves the first item in the queue without removing it
	 * @return the value of the first item in the queue
	 */
	public E peek() {
		if(size > 0) {
			return head.data;
		}
		else {
			return null;
		}
	}
	
	public int getSize() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public String toString() {
		String result = "Queue[";
		Node cur = head;
		
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


