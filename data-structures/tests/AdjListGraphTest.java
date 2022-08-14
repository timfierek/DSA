package tests;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import data_structures.AdjListGraph;



class AdjListGraphTest {

	@Test
	void testConstructor1() {
		AdjListGraph testGraph = new AdjListGraph();
		
		assertNotNull(testGraph);
	}
	
	@Test
	void testConstructor2() {
		AdjListGraph testGraph = new AdjListGraph();
		int expected = 0;
		int actual = testGraph.getNumEdges();
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testConstructor3() {
		AdjListGraph testGraph = new AdjListGraph();
		int expected = 0;
		int actual = testGraph.getNumVertices();
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testAddVertex1() {
		AdjListGraph testGraph = new AdjListGraph();
		int expected = 2;
		testGraph.addVertex("vertex1");
		testGraph.addVertex("vertex2");
		int actual = testGraph.getNumVertices();
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testAddVertex2() {
		AdjListGraph testGraph = new AdjListGraph();
		boolean expected = true;
		testGraph.addVertex("vertex1");
		testGraph.addVertex("vertex2");
		boolean actual = testGraph.containsVertex("vertex2");
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testRemoveVertex1() {
		AdjListGraph testGraph = new AdjListGraph();
		boolean expected = false;
		testGraph.addVertex("vertex1");
		testGraph.addVertex("vertex2");
		testGraph.removeVertex("vertex2");
		boolean actual = testGraph.containsVertex("vertex2");
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testRemoveVertex2() {
		AdjListGraph testGraph = new AdjListGraph();
		boolean expected = false;
		
		boolean actual = testGraph.removeVertex("vertex2");
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testRemoveVertex3() {
		AdjListGraph testGraph = new AdjListGraph();
		boolean expected = true;
		testGraph.addVertex("vertex1");

		boolean actual = testGraph.removeVertex("vertex1");
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testAddEdge1() {
		AdjListGraph testGraph = new AdjListGraph();
		int expected = 0;
		testGraph.addVertex("bob");
		testGraph.addVertex("mike");
		testGraph.addVertex("john");

		int actual = testGraph.getNumEdges();
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testAddEdge2() {
		AdjListGraph testGraph = new AdjListGraph();
		int expected = 2;
		testGraph.addVertex("bob");
		testGraph.addVertex("mike");
		testGraph.addVertex("john");
		testGraph.addEdge("john", "bob");
		testGraph.addEdge("john", "mike");

		int actual = testGraph.getNumEdges();
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testRemoveEdge1() {
		AdjListGraph testGraph = new AdjListGraph();
		int expected = 0;
		testGraph.addVertex("bob");
		testGraph.addVertex("mike");
		testGraph.addVertex("john");
		testGraph.addEdge("john", "bob");
		testGraph.removeEdge("john", "bob");

		int actual = testGraph.getNumEdges();
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testAreConnected1() {
		AdjListGraph testGraph = new AdjListGraph();
		boolean expected = true;
		testGraph.addVertex("bob");
		testGraph.addVertex("mike");
		testGraph.addVertex("john");
		testGraph.addEdge("john", "bob");

		boolean actual = testGraph.areConnected("john", "bob");
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testAreConnected2() {
		AdjListGraph testGraph = new AdjListGraph();
		boolean expected = false;
		testGraph.addVertex("bob");
		testGraph.addVertex("mike");
		testGraph.addVertex("john");
		testGraph.addEdge("john", "bob");

		boolean actual = testGraph.areConnected("john", "mike");
		
		assertEquals(expected, actual);
	}

}
