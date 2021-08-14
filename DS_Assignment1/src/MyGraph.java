import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

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
	
	public void BFS(int s) {
		boolean visited[] = new boolean[this.vertices];
		 
        // Create a queue for BFS
        Queue<Integer> queue = new LinkedList<Integer>();
 
        // Mark the current node as visited and enqueue it
        visited[s]=true;
        queue.add(s);
 
        while (queue.size() != 0)
        {
            // Dequeue a vertex from queue and print it
            s = queue.poll();
            System.out.print(s+" ");
 
            // Get all adjacent vertices of the dequeued vertex s
            // If a adjacent has not been visited, then mark it
            // visited and enqueue it
            Iterator<Integer> i = this.adj.get(s).listIterator();
            while (i.hasNext())
            {
                int n = i.next();
                if (!visited[n])
                {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
	}
	
	public void DFS(int s) {
		Vector<Boolean> visited = new Vector<Boolean>(vertices);
        for (int i = 0; i < vertices; i++)
            visited.add(false);
 
        // Create a stack for DFS
        Stack<Integer> stack = new Stack<>();
         
        // Push the current source node
        stack.push(s);
         
        while(stack.empty() == false)
        {
            // Pop a vertex from stack and print it
            s = stack.peek();
            stack.pop();
             
            // Stack may contain same vertex twice. So
            // we need to print the popped item only
            // if it is not visited.
            if(visited.get(s) == false)
            {
                System.out.print(s + " ");
                visited.set(s, true);
            }
             
            // Get all adjacent vertices of the popped vertex s
            // If a adjacent has not been visited, then push it
            // to the stack.
            Iterator<Integer> itr = adj.get(s).iterator();
             
            while (itr.hasNext())
            {
                int v = itr.next();
                if(!visited.get(v))
                    stack.push(v);
            }
             
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
        System.out.println("BFS OF GRAPH :");
        graph.BFS(0);
        System.out.println();
        System.out.println("DFS OF GRAPH :");
        graph.DFS(0);
	}
	
}
