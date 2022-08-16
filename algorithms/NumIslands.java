import java.util.HashSet;

/**
 * Determine the number of islands (non-connected) elements in graph represented by a matrix
 * 
 * @author Tim Fierek
 *
 */
public class NumIslands {
	
//	[0, 0, 1, 1, 0]
//  [0, 0, 1, 0, 0]
//	[0, 0, 0, 0, 0]
//  [0, 1, 0, 1, 0]
//  [0, 0, 0, 1, 0]
	
	public static void main(String[] args) {
		int[][] graph = {
				{0, 0, 1, 1, 0},
				{0, 0, 1, 0, 0},
				{0, 0, 0, 1, 0},
			    {0, 0, 0, 0, 0},
			    {0, 0, 0, 1, 0}};
		
		System.out.println(numIslands(graph));
	}
	
	public static int numIslands(int[][] graph) {
		int count = 0;
		HashSet<String> visited = new HashSet<String>();
		
		for(int i = 0; i < graph[0].length; i++) {
			for(int j = 0; j < graph.length; j++) {
				if(graph[i][j] == 1) {
					if(explore(graph, i, j, visited) == true) count++;
				}
			}
		}
		return count;
	}
	
	public static boolean explore(int[][] graph, int x, int y, HashSet<String> visited) {
		boolean xInbounds = x >= 0 && x < graph[0].length;
		boolean yInbounds = y >= 0 && y < graph.length;
		
		if(!xInbounds || !yInbounds) return false;
		
		if(graph[x][y] == 0) return false;
				
		String coords = x + " " + y;
		if(visited.contains(coords)) return false;
		visited.add(x + " " + y);
		
		explore(graph, x + 1, y, visited);
		explore(graph, x - 1, y, visited);
		explore(graph, x, y + 1, visited);
		explore(graph, x, y - 1, visited);
		
		return true;
	}
	
}
