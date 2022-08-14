package data_structures;

public class SinglyLinkedList<E> {

	private class Node{
		private Node next;
		private E data;
		
		public Node(E data) {
			this.data = data;
			next = null;
		}
		
	}
	
	private Node head;
	private int size;
	
	public SinglyLinkedList() {
		head = null;
		size = 0;
	}
	
	public boolean add(E data) {
		if(head == null) {
			head = new Node(data);
			size++;
			return true;
		}
		
		Node cur = head;
		
		while(cur.next != null) {
			cur = cur.next;
		}
		
		cur.next = new Node(data);
		size++;
		
		return true;
	}
	
	public E get(int index) {
		if(index > (size - 1) || index < 0) {
			return null;
		}
		
		Node pointer = head;
		for(int i = 0; i < index; i++) {
			pointer = pointer.next;
		}
		
		return pointer.data;
	}
	
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
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public boolean remove(int ind) {
		int index = indexOf(get(ind));
		if(index == -1) {
			return false;
		}
		
		Node cur = head;
		for(int i = 0; i < index - 1; i++) {
			cur = cur.next;
		}
		cur.next = cur.next.next;
		
		return true;
	}
	
	public int getSize() {
		return size;
	}
	
	public String toString() {
		String result = ("SinglyLinkedList[" + head.data);
		Node cur = head;
		while(head.next != null) {
			result += (", " + cur.data);
			cur = cur.next;
		}
		
		return result;
	}
	
}
