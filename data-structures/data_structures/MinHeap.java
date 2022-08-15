package data_structures;
import java.util.Arrays;

/**
 * Basic implementation of a min heap data structure. 
 * Implemented using an array for data storage.
 * 
 * @author Tim Fierek
 *
 */
public class MinHeap {

	private int size;
	private int capacity;
	private int[] data;
	
	public MinHeap() {
		size = 0;
		capacity = 20;
		data = new int[capacity];
	}
	
	public int getLeftChildIndex(int parentIndex) {
		return (parentIndex * 2 + 1);}
	
	public int getRightChildIndex(int parentIndex) {
		return (parentIndex * 2 + 2);}
	
	public int getParentIndex(int childIndex) {
		return ((childIndex - 1) / 2);}
	
	public int rightChild(int index) {
		return data[getRightChildIndex(index)];}
	
	public int leftChild(int index) {
		return data[getLeftChildIndex(index)];}
	
	public int parent(int index) {
		return data[getParentIndex(index)];}
	
	public boolean hasParent(int index) {
		return getParentIndex(index) > -1;}
	
	public boolean hasLeftChild(int index) {
		return getLeftChildIndex(index) < size;}
	
	public boolean hasRightChild(int index) {
		return getRightChildIndex(index) < size;}
	
	public int getSize() {
		return size;}
	
	// Helper method for adding or removing nodes
	public void swap(int index1, int index2) {
		int temp = data[index1];
		data[index1] = data[index2];
		data[index2] = temp;
	}
	
	// Helper method for verifying adequate size for the heap
	public void verifyCapacity() {
		if(size == capacity) {
			data = Arrays.copyOf(data, capacity * 2);
			capacity *= 2;
		}
	}
	
	// View top (smallest) element without removing
	public int peek() {
		if(size == 0) {
			throw new IllegalStateException("Heap is empty");
		}
		return data[0];
	}
	
	// View and return the top (smallest) element
	public int poll() {
		if(size == 0) {
			throw new IllegalStateException("Heap is empty");
		}

		int value = data[0];
		data[0] = data[size - 1];
		size--;
		heapifyDown();
		return value;
	}
	
	/**
	 * Restore the min heap property by moving the top element down to its rightful place
	 * @TimeComplexity O(log n)
	 */
	public void heapifyDown() {
		int index = 0;
		while(hasLeftChild(index) || hasRightChild(index)) {
			int smallerChildIndex = getLeftChildIndex(index);
			
			if(hasRightChild(index) && (rightChild(index) < leftChild(index))){
				smallerChildIndex = getRightChildIndex(index);
			}
			
			if(data[index] < data[smallerChildIndex]) {
				break;
			}
			else {
				swap(index, smallerChildIndex);
			}
			index = smallerChildIndex;
		}
	}
	 
	/**
	 * Move the bottom most element up to its correct position in the heap
	 * @TimeComplexity O(d) where d is the depth of the heap
	 */
	public void heapifyUp() {
		int index = size - 1;
		while(hasParent(index) && (parent(index) > data[index])) {
			swap(getParentIndex(index), index);
			index = getParentIndex(index);
		}
	}
	
	/**
	 * Adds an item to the heap
	 * 
	 * @param element number to be added to the heap
	 */
	public void add(int element) {
		verifyCapacity();
		data[size] = element;
		size++;
		heapifyUp();
	}
	
}
