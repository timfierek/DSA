package data_structures;

/**
 * Singly linked list with basic functionality using generic type E.
 * 
 * @author Tim Fierek
 *
 * @param <E> the type of data for each linked list node to store
 */
public class SinglyLinkedList<E> {

	/**
	 *	Nested node class to hold information, and pointer to next node.
	 */
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
	
	public SinglyLinkedList() {
		head = null;
		tail = null;
		size = 0;
	}
	
	/**
	 * Simple add method adding at the tail of the linked list in constant time due to storage of the tail node.
	 * 
	 * @param data value of type E to be added to linked list
	 * @TimeComplexity O(1)
	 */
	public void add(E data) {
		Node newNode = new Node(data);

		if(tail == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
		
		size++;
	}
	
	/**
	 * get returns data E at index "index" without removing the node from the list. 
	 * 
	 * @param index index of Node to be returned
	 * @return the data at index 'index'
	 * @TimeComplexity O(n)
	 * @throws IndexOutOfBoundsException
	 */
	public E get(int index) throws IndexOutOfBoundsException{
		if(index > (size - 1) || index < 0) {
			throw new IndexOutOfBoundsException("index " + index + " out of bounds for length " + getSize());
		}
		
		Node pointer = head;
		
		for(int i = 0; i < index; i++) {
			pointer = pointer.next;
		}
		
		return pointer.data;
	}
	
	/**
	 * Returns true if the data value is found in the list
	 * 
	 * @param data value to be searched for
	 * @return true if data is in list, false otherwise
	 * @TimeComplexity O(n)
	 */
	public boolean contains(E data) {
		if(size == 0) {
			return false;
		}
		
		Node cur = head;
				
		do{
			if(cur.data == data) {
				return true;
			}
			else {
				cur = cur.next;
			}
		} while(cur.next != null); 
		
		if(cur.data == data) {
			return true;
		}
		
		return false;
	}
	
	/**
	 * Finds the index of the first occurrence of data
	 * 
	 * @param data value to be searched for
	 * @return the index of the first occurrence of data or -1
	 * @TimeComplexity O(n)
	 */
	public int indexOf(E data) {
		Node cur = head;
		if(size == 0) {
			return -1;
		}
		
		for(int i = 0; cur.next != null; i++) {
			if(cur.data == data) {
				return i;
			}
			cur = cur.next;
		}
		
		if(cur.data == data) {
			return (size - 1);
		}
		
		return -1;
	}
	
	/**
	 * Determines if the current list is empty
	 * 
	 * @return true if the list is empty, false otherwise
	 */
	public boolean isEmpty() {
		return size == 0;
	}
	
	/**
	 * Removes the first item (head) in the linked list
	 * 
	 * @return E the value at the head of the list
	 * @throws Exception 
	 * @TimeComplexity O(1)
	 */
	public E remove() throws Exception {
		if(head == null) {
			throw new Exception("can not remove from list of size " + getSize());
		}
		
		E data = head.data;
		head = head.next;
		
		size--;
		return data;
	}
	
	/**
	 * Removes the item at index ind and returns the value of it
	 * 
	 * @param ind index of item to be removed
	 * @return the value of the item at index ind
	 * @TimeComplexity O(n)
	 */
	public E remove(int ind) {
		if(ind == -1 || ind > getSize() - 1) {
			throw new IndexOutOfBoundsException("Index not in range for singly linked list of size " + getSize());
		}
		
		Node cur = head;
		E data = cur.data;
		
		for(int i = 0; i < ind - 1; i++) {
			cur = cur.next;
		}
		//Node1, Node2, Node3
		//  0      1      2   
		
		data = cur.next.data;
		cur.next = cur.next.next;
		
		size--;
		return data;
	}
	
	/**
	 * Returns the size of the list
	 * @return the number of items in the list
	 */
	public int getSize() {
		return size;
	}
	
	public String toString() {
		if(head == null) {
			return "SinglyLinkedList[]";
		}
		
		Node cur = head;
		String result = ("SinglyLinkedList[" + cur.data);
		cur = cur.next;
		
		while(cur != null) {
			result += (", " + cur.data);
			cur = cur.next;
		}
		
		result += "]";
		
		return result;
	}
	
}
