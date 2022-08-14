import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class DepthFirstSearch {
	
	public static class Node{
		private int id;
		LinkedList<Node> adjacent = new LinkedList<Node>();
		private Node(int id) {
			this.id = id;
		}
	}
	
	private Node getNode(int id) {
		return nodeLookup.get(id);
	}
	
	public void addEdge(int source, int destination) {
		Node s = new Node(source);
		Node d = new Node(destination);
		s.adjacent.add(d);
	}
	
	private HashMap<Integer, Node> nodeLookup = new HashMap<Integer, Node>();
	
	public boolean dfs(int source, int dest) {
		Node s = getNode(source);
		Node d = getNode(source);
		HashSet<Integer> visited = new HashSet<Integer>();
		return dfs(s, d, visited);
	}
	
	private boolean dfs(Node source, Node destination, HashSet<Integer> visited) {
		if(visited.contains(source.id)) {
			return false;
		}
		visited.add(source.id);
		if(source == destination) {
			return true;
		}
		
		for(Node child : source.adjacent) {
			if(dfs(child, destination, visited)) {
				return true;
			}
		}
		
		return false;
	}
}
