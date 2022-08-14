package data_structures;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AdjListGraph {

	
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
	
	private int numVertices;
	private int numEdges;
	private HashMap<Vertex, List<Vertex>> adjacentVertices;

	public AdjListGraph() {
		adjacentVertices = new HashMap<>();
		numVertices = 0;
		numEdges = 0;
	}
	
	public boolean containsVertex(String data) {
		Vertex v = new Vertex(data);
		return(adjacentVertices.containsKey(v));
	}
	
	public boolean addVertex(String data) {
		Vertex newVertex = new Vertex(data);
		
		if(!adjacentVertices.containsKey(newVertex)) {
			adjacentVertices.put(newVertex, new ArrayList<>());
			numVertices++;
			return true;
		}
		
		return false;
	}
	
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
	
	public void addEdge(String data1, String data2) {
		Vertex v1 = new Vertex(data1);
		Vertex v2 = new Vertex(data2);
		adjacentVertices.get(v1).add(v2);
		if(adjacentVertices.get(v2).add(v1)) {
			numEdges++;
		}
	}
	
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
	
	public boolean areConnected(String data1, String data2) {
		Vertex v1 = new Vertex(data1);
		Vertex v2 = new Vertex(data2);
		
		return(adjacentVertices.get(v1).contains(v2));
	}
	
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
