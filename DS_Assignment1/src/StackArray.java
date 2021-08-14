
public class StackArray {

	public static final  int MAX = 1000;
	int top ;
	
	int myStack[];
	
	public StackArray() {
		// TODO Auto-generated constructor stub
		top = -1;
		myStack = new int[MAX];
	}
	
	public boolean isEmpty() {
		
		return top < 0;
	}
	
	public void push(int item ) {
		
		if(top >= MAX-1) {
			System.out.println("Stack overflow");
		}
		else {
			top ++ ;
			myStack[top] = item; 
		}
	}
	
	public int pop() {
		
		if(top < 0) {
			System.out.println("Stack underflow");
			return -1;
		}
		else {
			int  value = myStack[top];
			top -- ;
			return value;
		}
	}
	
	public int top() {
		
		if(top < 0) {
			System.out.println("Stack is empty ");
			return -1;
		}
		
		else {
			return myStack[top];
		}
	}
	
	public static void main(String[] args) {
		
		StackArray stack = new StackArray();
		
		stack.push(1);
		
		stack.push(4);
		
		System.out.println(stack.top());
		
		stack.pop();
		stack.push(3);
		System.out.println(stack.top());

		
		
	}
}
