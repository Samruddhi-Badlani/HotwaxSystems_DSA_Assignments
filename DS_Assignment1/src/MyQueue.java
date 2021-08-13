
public class MyQueue {

	Node front ;
	Node rear ;
	
	public MyQueue() {
		
		// TODO Auto-generated constructor stub
		front = null;
		rear = null;
	}
	
	public void enqueue(int item ) {
		
		Node newNode = new Node(item);
		
		if(front == null && rear == null) {
			
			front = newNode ;
			rear = newNode ;
		}
		else {
			rear.next = newNode ; 
			
			rear = newNode;
		}
	}
	
	public void dequeue() {
		
		if(front == null) {
			System.out.println("Queue is empty ");
		}
		
		else {
			front = front.next;
		}
	}
	
	public int front() {
		
		if(front == null) {
			return -1;
		}
		else {
			return front.item;
		}
		
	}
	
	public static void main(String[] args) {
		
		
	MyQueue queue = new MyQueue() ;
	
	queue.enqueue(1);
	
	queue.enqueue(2);
	
	System.out.println(queue.front());
	queue.dequeue();
	
	System.out.println(queue.front());
	
	}
}
