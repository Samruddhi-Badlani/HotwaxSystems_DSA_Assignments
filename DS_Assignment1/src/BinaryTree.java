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
	}
}
