import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class BreadthFirstSearch {

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
	
	public boolean bfs(int s, int d) {
		Node source = getNode(s);
		Node destination = getNode(d);
		LinkedList<Node> queue = new LinkedList<Node>();
		HashSet<Integer> visited = new HashSet<Integer>();
		queue.add(source);
		
		while(!queue.isEmpty()) {
			Node node = queue.remove();
			if(node == destination) {
				return true;
			}
			
			if(visited.contains(node.id)) {
				continue;
			}
			
			visited.add(node.id);
			
			for(Node child : node.adjacent) {
				queue.add(child);
			}
		}
		return false;
	}
	
}
