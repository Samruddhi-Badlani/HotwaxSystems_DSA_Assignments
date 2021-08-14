import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
	TreeNode root ;
	
	public BinaryTree() {
		// TODO Auto-generated constructor stub
		this.root = null ;
	}
	
	public void insert(int value) {
		
		if(root == null) {
			root = new TreeNode(value);
		}
		else {
			Queue<TreeNode> queue = new LinkedList<TreeNode>();
			
			queue.add(root);
			
			while(queue.size() > 0) {
				TreeNode currentNode = queue.peek();
				
				queue.poll();
				
				if(currentNode.left == null) {
					currentNode.left = new TreeNode(value);
					return;
				}
				else {
					queue.add(currentNode.left);
				}
				if(currentNode.left == null) {
					currentNode.left = new TreeNode(value);
					return;
				}
				else {
					queue.add(currentNode.left);
					
				}
			}
			
			
			
		}
	}
	
	public void preorderTraversal(TreeNode root) {
		
		
		TreeNode tempNode = root ;
		
		if(tempNode == null) {
			return;
		}
		else {
			System.out.print(tempNode.key+" ");
			preorderTraversal(root.left);
			preorderTraversal(root.right);
			
		}
		
		
	}
	
	public void deleteDeepest(TreeNode root, TreeNode delNode) {
		Queue<TreeNode> q = new LinkedList<TreeNode>();
	    q.add(root);
	     
	    TreeNode temp = null;
		 while (!q.isEmpty())
		    {
		        temp = q.peek();
		        q.remove();
		         
		        if (temp == delNode)
		        {
		            temp = null;
		            return;
		             
		        }
		        if (temp.right!=null)
		        {
		            if (temp.right == delNode)
		            {
		                temp.right = null;
		                return;
		        }
		        else
		            q.add(temp.right);
		    }
		        if (temp.left != null)
		        {
		            if (temp.left == delNode)
		            {
		                temp.left = null;
		                return;
		            }
		            else
		                q.add(temp.left);
		        }
		    }
	}
	public void delete(int value) {
		
		if (root == null)
	        return;
	         
	    if (root.left == null && root.right == null)
	    {
	        if (root.key == value)
	        {
	              root=null;
	              return;
	        }
	        else
	            return;
	    }
	    Queue<TreeNode> q = new LinkedList<TreeNode>();
	    q.add(root);
	    TreeNode temp = null, keyNode = null;
	     
	    // Do level order traversal until
	    // we find key and last node.
	    while (!q.isEmpty())
	    {
	        temp = q.peek();
	        q.remove();
	         
	        if (temp.key == value)
	            keyNode = temp;
	 
	        if (temp.left != null)
	            q.add(temp.left);
	 
	        if (temp.right != null)
	            q.add(temp.right);
	    }
	    if (keyNode != null)
	    {
	        int x = temp.key;
	        deleteDeepest(root, temp);
	        keyNode.key = x;
	    }
		
	}
	
	public boolean search(TreeNode root,int value) {
		
		if (root == null)
	        return false;
	 
	    if (root.key == value)
	        return true;
	 
	    // then recur on left sutree /
	    boolean res1 = search(root.left, value);
	   
	    // node found, no need to look further
	    if(res1) {
	    	return true;
	    }
	 
	    // node is not found in left,
	    // so recur on right subtree /
	    boolean res2 = search(root.right, value);
	 
	    return res2;
	
	}
	
	public static void main(String[] args) {
		BinaryTree myBinaryTree = new BinaryTree();
		TreeNode root = new TreeNode(1);
		myBinaryTree.root = root;
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);

		myBinaryTree.preorderTraversal(root);
		
		myBinaryTree.delete(1);
		System.out.println();
		myBinaryTree.preorderTraversal(root);
		System.out.println();
		
		if(myBinaryTree.search(root, 20)) {
			
			System.out.println("20 is  present ");
		}
		else {
			
			System.out.println("20 is not  present ");
		}
		if(myBinaryTree.search(root, 3)) {
			
			System.out.println("3 is  present ");
		}
		else {
			
			System.out.println("3 is not  present ");
		}
		
		myBinaryTree.preorderTraversal(root);
		
	}
}
