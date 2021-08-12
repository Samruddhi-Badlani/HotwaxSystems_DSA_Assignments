class Node{
	int item;
	Node next;
	
	public Node(int item) {
		
		// TODO Auto-generated constructor stub
		this.item = item;
		this.next = null;
		
	}
}
public class LinkedList {
	
	Node headNode;
	
	public LinkedList() {
	
		// TODO Auto-generated constructor stub
		headNode = null;
	}
	
	
	// Adds the given item at the end of list 
	public void add(int item) {
		
		if(headNode == null) {
			headNode = new Node(item);
		}
		else {
			
			Node tempNode = headNode ;
			while(tempNode.next != null) {
				tempNode = tempNode.next;
			}
			tempNode.next = new Node(item);
		}
	}
	
	// Add the given item at starting of list 
	public void addAtBegin(int item) {
		
		Node tempNode = new Node(item);
		tempNode.next = headNode;
		headNode = tempNode;
	}
	
	// Add the given item after a particular value
	public void addAfter(int item,int value) {
		
		Node tempNode = headNode;
		
		while(tempNode.item != value && tempNode !=null) {
			tempNode = tempNode.next;
			if(tempNode == null) {
				break;
			}
		}
		if(tempNode == null) {
			System.out.println("The value "+value +" is not present, addition unsuccessful");
		}
		else {
			Node newNode  = new Node(item);
			
			newNode.next = tempNode.next;
			tempNode.next = newNode;
		}
	}
	
	// Deletes the last element present in linked list 
	public void deleteLast() {
		
		if(headNode == null) {
			System.out.println("The list is empty ");
		}
		else {
			Node tempNode = headNode ; 
			while(tempNode.next.next != null) {
				tempNode = tempNode.next;
			}
			
			tempNode.next = null;
		}
	}
	
	// Deletes the last element present in linked list 
	public void deleteFirst() {
			
		if(headNode == null) {
			System.out.println("The list is empty ");
		}
		else {
			headNode = headNode.next ;
		}
	}
	
	// Deletes the given value 
	public void deleteValue(int value) {
		
		if(headNode == null) {
			System.out.println("The list is empty ");
		}
		else {
			Node tempNode = headNode ;
			
			if(headNode.item == value) {
				deleteFirst();
			}
			else {
				while( tempNode.next != null && tempNode.next.item != value) {
					tempNode = tempNode.next;
					if(tempNode.next == null) {
						break;
					}
				}
				if(tempNode == null ) {
					System.out.println("The given value : "+value+" is not present in list : deletion unsuccessfull");
				}
				
				else if(tempNode.next == null && tempNode.item == value) {
					deleteLast();
				}
				else {
					tempNode.next = tempNode.next.next ; 
				}
			}
		}
	}
		
	
		
	// Print the list 
	public void print() {
		
		Node tempNode = headNode;
		while(tempNode != null) {
			
			if(tempNode.next != null)
			System.out.print(tempNode.item+"->");
			else {
				System.out.print(tempNode.item);
			}
			tempNode = tempNode.next;
		}
		System.out.print("\n");
	}
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addAtBegin(40);
		list.add(1);
		
		list.add(2);
		list.addAfter(45,1);
		list.print();
		
		
		list.add(30);
		list.add(20);
		list.print();
		list.deleteValue(45);
		list.deleteValue(20);
		list.deleteValue(40);
		
		
		list.print();
	}
}
