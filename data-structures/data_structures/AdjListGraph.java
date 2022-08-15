package data_structures;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Adjacency list implementation of an undirected graph.
 * 
 * @author Tim Fierek
 *
 */
public class AdjListGraph {
	
	/**
	 * Vertex class stores data and generates hashCode
	 *
	 */
	private class Vertex{
		private String data;
		
		public Vertex(String data) {
			this.data = data;
		}
		
		@Override
		public boolean equals(Object o) {
			if(o == null) {
				return false;
			}
			else if(this == o) {
				return true;
			}
			else if((o instanceof Vertex) && (((Vertex) o).data.equals(this.data))) {
				return true;
			}
			else {
				return false;
			}
		}
		
		@Override
		public int hashCode() {
			return data.hashCode();
		}
	}
	
	private int numVertices;									//Number of vertices
	private int numEdges;										//Number of edges
	
	//Stores entire data structure, vertices are the keys and the values are the list of adjacent vertices to that vertex
	private HashMap<Vertex, List<Vertex>> adjacentVertices;		

	public AdjListGraph() {
		adjacentVertices = new HashMap<>();
		numVertices = 0;
		numEdges = 0;
	}
	
	/**
	 * Determines if data is stored in the graph
	 * 
	 * @param data data to be stored in the graph 
	 * @return true if the data is contained in the graph, false othewise
	 * @TimeComplexity O(1)
	 */
	public boolean containsVertex(String data) {
		Vertex v = new Vertex(data);
		return(adjacentVertices.containsKey(v));
	}
	
	/**
	 * Adds the data to the graph and returns true or returns false in which case the data is already in graph
	 * 
	 * @param data information to be stored in the vertex
	 * @return true if vertex is successfully added, false if data is already a vertex in the graph
	 * @TimeComplexity O(1)
	 */
	public boolean addVertex(String data) {
		Vertex newVertex = new Vertex(data);
		
		if(!adjacentVertices.containsKey(newVertex)) {
			adjacentVertices.put(newVertex, new ArrayList<>());
			numVertices++;
			return true;
		}
		
		return false;
	}
	
	/**
	 * Removes a specified vertex in the graph
	 * 
	 * @param data information to be stored in the graph
	 * @return true if vertex is successfully removed, false if vertex does not exist in graph
	 * @TimeComplexity O(1)
	 */
	public boolean removeVertex(String data) {
		Vertex vertex = new Vertex(data);
		
		if(adjacentVertices.containsKey(vertex)) {
			adjacentVertices.values().stream().forEach(e -> e.remove(vertex));
			adjacentVertices.remove(vertex);
			numVertices--;
			return true;
		}
		
		return false;
	}
	
	/**
	 * Adds and edge and the two vertices it connects
	 * 
	 * @param data1 value of vertex 1
	 * @param data2 value of vertex 2
	 * @TimeComplexity O(1)
	 */
	public void addEdge(String data1, String data2) {
		Vertex v1 = new Vertex(data1);
		Vertex v2 = new Vertex(data2);
		adjacentVertices.get(v1).add(v2);
		if(adjacentVertices.get(v2).add(v1)) {
			numEdges++;
		}
	}
	
	/**
	 * Removes the edge between two data points
	 * 
	 * @param data1 value of vertex 1
	 * @param data2 value of vertex 2
	 * @TimeComplexity O(1)
	 */
	public void removeEdge(String data1, String data2) {
		Vertex v1 = new Vertex(data1);
	    Vertex v2 = new Vertex(data2);
	    List<Vertex> edgesV1 = adjacentVertices.get(v1);
	    List<Vertex> edgesV2 = adjacentVertices.get(v2);
	    if (edgesV1 != null)
	        edgesV1.remove(v2);
	    if (edgesV2 != null)
	        edgesV2.remove(v1);
	    numEdges--;
	}
	
	/**
	 * Determines if two vertices share an edge
	 * 
	 * @param data1 value of vertex 1
	 * @param data2 value of vertex 2
	 * @return true if data1 and data2 share an edge, false otherwise
	 */
	public boolean areConnected(String data1, String data2) {
		Vertex v1 = new Vertex(data1);
		Vertex v2 = new Vertex(data2);
		
		return(adjacentVertices.get(v1).contains(v2));
	}
	
	/**
	 * Returns adjacent vertices to the input vertex
	 * 
	 * @param data vertex to search for
	 * @return a list of connected vertices
	 */
	public List<Vertex> getAdjVertices(String data){
		Vertex v = new Vertex(data);
		return adjacentVertices.get(v);
	}
	
	public int getNumVertices() {
		return numVertices;
	}
	
	public int getNumEdges() {
		return numEdges;
	}
	
}
