package tests;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import data_structures.Stack;

class StackTest {

	@Test
	void testConstructor1() {
		Stack<Integer> testStack = new Stack<>();
		
		String expected = "Stack[]";
		String actual = testStack.toString();
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testConstructor2() {
		Stack<Integer> testStack = new Stack<>();
		
		boolean expected = true;
		boolean actual = testStack.isEmpty();
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testConstructor3() {
		Stack<Integer> testStack = new Stack<>();
		
		int expected = 0;
		int actual = testStack.getSize();
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testPush1() {
		Stack<Integer> testStack = new Stack<>();
		
		testStack.push(1);
		testStack.push(2);
		
		int expected = 2;
		int actual = testStack.getSize();
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testPush2() {
		Stack<Integer> testStack = new Stack<>();
		
		testStack.push(1);
		testStack.push(2);
		
		boolean expected = false;
		boolean actual = testStack.isEmpty();
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testPush3() {
		Stack<Integer> testStack = new Stack<>();
		
		testStack.push(1);
		testStack.push(2);
		
		String expected = "Stack[2,1]";
		String actual = testStack.toString();
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testPeek1() {
		Stack<Integer> testStack = new Stack<>();
		
		testStack.push(43);
		testStack.push(20);
		testStack.push(3);
		
		Integer expected = 3;
		Integer actual = testStack.peek();
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testPeek2() {
		Stack<Integer> testStack = new Stack<>();
		
		Integer expected = null;
		Integer actual = testStack.peek();
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testPop1() {
		Stack<Integer> testStack = new Stack<>();
		
		testStack.push(43);
		testStack.push(20);
		testStack.push(3);
		testStack.pop();
		testStack.pop();

		Integer expected = 43;
		Integer actual = testStack.pop();
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testPop2() {
		Stack<Integer> testStack = new Stack<>();

		Integer expected = null;
		Integer actual = testStack.pop();
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testPop3() {
		Stack<Integer> testStack = new Stack<>();
		
		testStack.push(43);
		testStack.push(20);
		testStack.push(3);
		testStack.pop();
		testStack.pop();

		Integer expected = 43;
		Integer actual = testStack.pop();
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testPop4() {
		Stack<Integer> testStack = new Stack<>();
		
		testStack.push(43);
		testStack.push(20);
		testStack.push(3);
		testStack.pop();
		testStack.pop();
		testStack.pop();

		int expected = 0;
		int actual = testStack.getSize();
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testPop5() {
		Stack<Integer> testStack = new Stack<>();
		
		testStack.push(43);
		testStack.push(20);
		testStack.push(3);
		testStack.pop();
		
		int expected = 2;
		int actual = testStack.getSize();
		
		assertEquals(expected, actual);
	}

}
