package tests;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import data_structures.SinglyLinkedList;


class SinglyLinkedListTest {

	@Test
	void testConstructor1() {
		SinglyLinkedList<String> testList = new SinglyLinkedList<>();
		
		int expected = 0;
		int actual = testList.getSize();
		assertEquals(expected, actual);
	}
	
	@Test
	void testAdd1() {
		SinglyLinkedList<String> testList = new SinglyLinkedList<>();
		
		boolean expected = true;
		boolean actual = testList.add("node1");
		assertEquals(expected, actual);
	}
	
	@Test
	void testAdd2() {
		SinglyLinkedList<String> testList = new SinglyLinkedList<>();
		
		boolean expected = true;
		testList.add("node1");
		testList.add("node2");
		boolean actual = testList.add("node3");
		assertEquals(expected, actual);
	}
	
	@Test
	void testAdd3() {
		SinglyLinkedList<String> testList = new SinglyLinkedList<>();
		
		int expected = 3;
		testList.add("node1");
		testList.add("node2");
		testList.add("node3");
		int actual = testList.getSize();
		assertEquals(expected, actual);
	}
	
	@Test
	void testGet1() {
		SinglyLinkedList<String> testList = new SinglyLinkedList<>();
		
		testList.add("node1");
		testList.add("node2");
		testList.add("node3");
		String expected = "node2";
		String actual = testList.get(1);
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testGet2() {
		SinglyLinkedList<String> testList = new SinglyLinkedList<>();
		
		testList.add("node1");
		testList.add("node2");
		testList.add("node3");
		String expected = "node1";
		String actual = testList.get(0);
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testGet3() {
		SinglyLinkedList<String> testList = new SinglyLinkedList<>();
		
		testList.add("node1");
		testList.add("node2");
		testList.add("node3");
		
		String expected = null;
		String actual = testList.get(4);
		assertEquals(expected, actual);
	}
	
	@Test
	void testGet4() {
		
		SinglyLinkedList<String> testList = new SinglyLinkedList<>();
		
		testList.add("node1");
		testList.add("node2");
		testList.add("node3");
		
		String expected = null;
		String actual = testList.get(-1);
		assertEquals(expected, actual);
	}
	
	@Test
	void testGet5() {
		SinglyLinkedList<String> testList = new SinglyLinkedList<>();
		
		String expected = null;
		String actual = testList.get(0);
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testContains1() {
		SinglyLinkedList<String> testList = new SinglyLinkedList<>();
		
		testList.add("node1");
		testList.add("node2");
		testList.add("node3");
		boolean expected = true;
		boolean actual = testList.contains("node1");
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testContains2() {
		SinglyLinkedList<String> testList = new SinglyLinkedList<>();
		
		testList.add("node1");
		testList.add("node2");
		testList.add("node3");
		boolean expected = true;
		boolean actual = testList.contains("node3");
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testContains3() {
		SinglyLinkedList<String> testList = new SinglyLinkedList<>();
		
		testList.add("node1");
		testList.add("node2");
		testList.add("node3");
		boolean expected = false;
		boolean actual = testList.contains("tim");
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testContains4() {
		SinglyLinkedList<String> testList = new SinglyLinkedList<>();
		
		boolean expected = false;
		boolean actual = testList.contains("");
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testIndexOf1() {
		SinglyLinkedList<String> testList = new SinglyLinkedList<>();
		
		testList.add("node1");
		testList.add("node2");
		testList.add("node3");
		int expected = 0;
		int actual = testList.indexOf("node1");
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testIndexOf2() {
		SinglyLinkedList<String> testList = new SinglyLinkedList<>();
		
		testList.add("node1");
		testList.add("node2");
		testList.add("node3");
		int expected = 1;
		int actual = testList.indexOf("node2");
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testIndexOf3() {
		SinglyLinkedList<String> testList = new SinglyLinkedList<>();
		
		testList.add("node1");
		testList.add("node2");
		testList.add("node3");
		int expected = 2;
		int actual = testList.indexOf("node3");
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testIndexOf4() {
		SinglyLinkedList<String> testList = new SinglyLinkedList<>();
		
		testList.add("node1");
		testList.add("node2");
		testList.add("node3");
		int expected = -1;
		int actual = testList.indexOf("node4");
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testIndexOf5() {
		SinglyLinkedList<String> testList = new SinglyLinkedList<>();
		
		int expected = -1;
		int actual = testList.indexOf("empty");
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testIsEmpty1() {
		SinglyLinkedList<String> testList = new SinglyLinkedList<>();
		
		boolean expected = true;;
		boolean actual = testList.isEmpty();
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testIsEmpty2() {
		SinglyLinkedList<String> testList = new SinglyLinkedList<>();
		
		testList.add("node1");
		testList.add("node2");
		testList.add("node3");
		boolean expected = false;
		boolean actual = testList.isEmpty();
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testRemove1() {
		SinglyLinkedList<String> testList = new SinglyLinkedList<>();
		
		testList.add("node1");
		testList.add("node2");
		testList.add("node3");
		boolean expected = false;
		boolean actual = testList.remove(4);
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testRemove2() {
		SinglyLinkedList<String> testList = new SinglyLinkedList<>();
		
		testList.add("node1");
		testList.add("node2");
		testList.add("node3");
		boolean expected = true;
		boolean actual = testList.remove(1);
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testRemove3() {
		SinglyLinkedList<String> testList = new SinglyLinkedList<>();
		
		testList.add("node1");
		testList.add("node2");
		testList.add("node3");
		boolean expected = false;
		testList.remove(1);
		boolean actual = testList.contains("node2");
		
		assertEquals(expected, actual);
	}

}
