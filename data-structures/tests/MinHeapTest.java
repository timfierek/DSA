package tests;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import data_structures.MinHeap;

class MinHeapTest {

//				4
//			   / \
//			  7   9
//			 / \ 	   
//	       13   10
	
	
	
	@Test
	void testConstructor() {
		MinHeap testHeap = new MinHeap();
		
		int expected = 0;
		int actual = testHeap.getSize();
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testAdd1() {
		MinHeap testHeap = new MinHeap();
		
		testHeap.add(4);
		testHeap.add(7);
		testHeap.add(9);
		testHeap.add(13);
		testHeap.add(10);
		
		int expected = 5;
		int actual = testHeap.getSize();
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testAdd2() {
		MinHeap testHeap = new MinHeap();
		
		testHeap.add(4);
		testHeap.add(7);
		testHeap.add(9);
		testHeap.add(13);
		testHeap.add(10);
		
		int expected = 4;
		int actual = testHeap.peek();
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testAdd3() {
		MinHeap testHeap = new MinHeap();
		
		testHeap.add(10);
		testHeap.add(7);
		testHeap.add(13);
		testHeap.add(9);
		testHeap.add(4);
		
		int expected = 4;
		int actual = testHeap.peek();
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testAdd4() {
		MinHeap testHeap = new MinHeap();
		
		testHeap.add(10);
		testHeap.add(10);
		
		int expected = 10;
		int actual = testHeap.peek();
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testPoll1() {
		MinHeap testHeap = new MinHeap();
		
		testHeap.add(4);
		testHeap.add(7);
		testHeap.add(9);
		testHeap.add(13);
		testHeap.add(10);
		
		int expected = 4;
		int actual = testHeap.poll();
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testPoll2() {
		MinHeap testHeap = new MinHeap();
		
		testHeap.add(4);
		testHeap.add(7);
		testHeap.add(9);
		testHeap.add(13);
		testHeap.add(10);
		
		int expected = 7;
		testHeap.poll();
		int actual = testHeap.poll();
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testPoll3() {
		MinHeap testHeap = new MinHeap();
		
		testHeap.add(4);
		testHeap.add(7);
		testHeap.add(9);
		testHeap.add(13);
		testHeap.add(10);
		
		int expected = 9;
		testHeap.poll();
		testHeap.poll();
		int actual = testHeap.poll();
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testPoll4() {
		MinHeap testHeap = new MinHeap();
		
		testHeap.add(4);
		testHeap.add(7);
		testHeap.add(9);
		testHeap.add(13);
		testHeap.add(10);
		
		int expected = 10;
		testHeap.poll();
		testHeap.poll();
		testHeap.poll();
		int actual = testHeap.poll();
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testPoll5() {
		MinHeap testHeap = new MinHeap();
		
		testHeap.add(4);
		testHeap.add(7);
		testHeap.add(9);
		testHeap.add(13);
		testHeap.add(10);
		
		int expected = 13;
		testHeap.poll();
		testHeap.poll();
		testHeap.poll();
		testHeap.poll();
		int actual = testHeap.poll();
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testPoll6() {
		MinHeap testHeap = new MinHeap();
		
		testHeap.add(4);
		testHeap.add(7);
		testHeap.add(9);
		testHeap.add(13);
		testHeap.add(10);
		
		int expected = 2;
		testHeap.poll();
		testHeap.poll();
		testHeap.poll();
		int actual = testHeap.getSize();
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testPoll7() {
		MinHeap testHeap = new MinHeap();
		
		testHeap.add(4);
		testHeap.add(7);
		testHeap.add(9);
		testHeap.add(13);
		testHeap.add(10);
		
		int expected = 4;
		testHeap.poll();
		int actual = testHeap.getSize();
		
		assertEquals(expected, actual);
	}
	
	

}
