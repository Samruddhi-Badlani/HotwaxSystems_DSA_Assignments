import java.util.ArrayList;

public class MyGraph {
	
	public ArrayList<ArrayList<Integer>> adj;
	public int vertices;
	
	public MyGraph(int vertices ) {
		// TODO Auto-generated constructor stub
		adj = new ArrayList<ArrayList<Integer>>();
		this.vertices = vertices;
		for(int i = 0; i < vertices ; i++) {
			adj.add(new ArrayList<Integer>());
		}
	}
	
	public void addEdge(int u, int v) {
		adj.get(u).add(v);
		adj.get(v).add(u);
	}
	
	public void printGraph() {
		
        for (int i = 0; i < adj.size(); i++) {
            System.out.println("\nAdjacency list of vertex "  + i);
            System.out.print("head");
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print(" -> "+adj.get(i).get(j));
            }
            System.out.println();
        }
    }
	
	public static void main(String[] args) {
		int V = 5;
        MyGraph graph = new MyGraph(V);
      
 
        // Adding edges one by one
        graph.addEdge( 0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge( 1, 3);
        graph.addEdge( 1, 4);
        graph.addEdge( 2, 3);
        graph.addEdge( 3, 4);
         
        graph.printGraph();
	}
}
