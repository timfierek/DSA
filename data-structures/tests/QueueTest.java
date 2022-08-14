package tests;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import data_structures.Queue;
import data_structures.Stack;

class QueueTest {

	@Test
	void testConstructor1() {
		Queue<Integer> testQueue = new Queue<>();
		
		String expected = "Queue[]";
		String actual = testQueue.toString();
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testConstructor2() {
		Queue<Integer> testQueue = new Queue<>();
		
		boolean expected = true;
		boolean actual = testQueue.isEmpty();
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testConstructor3() {
		Queue<Integer> testQueue = new Queue<>();
		
		int expected = 0;
		int actual = testQueue.getSize();
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testEnqueue1() {
		Queue<Integer> testQueue = new Queue<>();
		
		testQueue.enqueue(1);
		testQueue.enqueue(2);
		
		int expected = 2;
		int actual = testQueue.getSize();
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testEnqueue2() {
		Queue<Integer> testQueue = new Queue<>();
		
		testQueue.enqueue(1);
		testQueue.enqueue(2);
		
		boolean expected = false;
		boolean actual = testQueue.isEmpty();
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testEnqueue3() {
		Stack<Integer> testStack = new Stack<>();
		
		testStack.push(1);
		testStack.push(2);
		
		String expected = "Stack[2,1]";
		String actual = testStack.toString();
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testPeek1() {
		Queue<Integer> testQueue = new Queue<>();
		
		testQueue.enqueue(43);
		testQueue.enqueue(20);
		testQueue.enqueue(3);
		
		Integer expected = 43;
		Integer actual = testQueue.peek();
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testPeek2() {
		Queue<Integer> testQueue = new Queue<>();
		
		Integer expected = null;
		Integer actual = testQueue.peek();
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testDequeue1() {
		Queue<Integer> testQueue = new Queue<>();
		
		testQueue.enqueue(43);
		testQueue.enqueue(20);
		testQueue.enqueue(3);
		testQueue.dequeue();
		testQueue.dequeue();

		Integer expected = 3;
		Integer actual = testQueue.dequeue();
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testDequeue2() {
		Queue<Integer> testQueue = new Queue<>();
		
		Integer expected = null;
		Integer actual = testQueue.dequeue();
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testDequeue3() {
		Queue<Integer> testQueue = new Queue<>();
		
		testQueue.enqueue(43);
		testQueue.enqueue(20);
		testQueue.enqueue(3);

		Integer expected = 43;
		Integer actual = testQueue.dequeue();
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testDequeue4() {
		Queue<Integer> testQueue = new Queue<>();
		
		testQueue.enqueue(43);
		testQueue.enqueue(20);
		testQueue.enqueue(3);
		testQueue.dequeue();
		testQueue.dequeue();
		testQueue.dequeue();

		Integer expected = 0;
		Integer actual = testQueue.getSize();
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testDequeue5() {
		Queue<Integer> testQueue = new Queue<>();
		
		testQueue.enqueue(43);
		testQueue.enqueue(20);
		testQueue.enqueue(3);
		testQueue.dequeue();

		Integer expected = 2;
		Integer actual = testQueue.getSize();
		
		assertEquals(expected, actual);
	}

}
