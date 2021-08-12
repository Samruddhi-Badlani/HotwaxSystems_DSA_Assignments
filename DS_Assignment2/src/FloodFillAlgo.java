import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
class Pair
{
    int x, y;
 
    public Pair(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
}
public class FloodFillAlgo {
	static int[] row = { -1, -1, -1, 0, 0, 1, 1, 1 };
    static  int[] col = { -1, 0, 1, -1, 1, -1, 0, 1 };
 

    public static boolean isSafe(char[][] M, int m, int n,
                                int x, int y, char target) {
        return x >= 0 && x < m && y >= 0 && y < n && M[x][y] == target;
    }
 
    // Flood fill using BFS
    public static void floodfill(char[][] M, int x, int y, char replacement)
    {
        int m = M.length;
        int n = M[0].length;
 
      
        // create a queue and enqueue starting pixel
        Queue<Pair> q = new ArrayDeque<>();
        q.add(new Pair(x, y));
 
        // get the target color
        char target_color = M[x][y];
 
        // break when the queue becomes empty
        while (!q.isEmpty())
        {
            // dequeue front node and process it
            Pair node = q.poll();
 
            // `(x, y)` represents the current pixel
            x = node.x;
            y = node.y;
 
            // replace the current pixel color with that of replacement
            M[x][y] = replacement;
 
            // process all eight adjacent pixels of the current pixel and
            // enqueue each valid pixel
            for (int k = 0; k < row.length; k++)
            {
                // if the adjacent pixel at position `(x + row[k], y + col[k])` is
                // is valid and has the same color as the current pixel
                if (isSafe(M, m, n, x + row[k], y + col[k], target_color))
                {
                    // enqueue adjacent pixel
                    q.add(new Pair(x + row[k], y + col[k]));
                }
            }
        }
    }
 
    public static void main(String[] args)
    {
        // matrix showing portion of the screen having different colors
        char[][] M = {
                "YYYGGGGGGG".toCharArray(),
                "YYYYYYGXXX".toCharArray(),
                "GGGGGGGXXX".toCharArray(),
                "WWWWWGGGGX".toCharArray(),
                "WRRRRRGXXX".toCharArray(),
                "WWWRRGGXXX".toCharArray(),
                "WBWRRRRRRX".toCharArray(),
                "WBBBBRRXXX".toCharArray(),
                "WBBXBBBBXX".toCharArray(),
                "WBBXXXXXXX".toCharArray()
        };
        for(int i = 0;i<M.length ; i++) {
        	for(int j = 0; j<M[0].length ; j++) {
        		System.out.print(M[i][j]+" ");
        	}
        	System.out.println();
        }
        
        System.out.println("**************");
 
        // start node
        int x = 3, y = 9;    // target color `X`
 
        // replacement color
        char replacement = 'C';
 
        // replace the target color with a replacement color
        floodfill(M, x, y, replacement);
 
        for(int i = 0;i<M.length ; i++) {
        	for(int j = 0; j<M[0].length ; j++) {
        		System.out.print(M[i][j]+" ");
        	}
        	System.out.println();
        }
    }

}
