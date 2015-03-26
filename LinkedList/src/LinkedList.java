class Node {
	int data ;
	Node next;
	
	public Node(int val){
	data = val;	
	}
	
	public String toString(){
		return " "+data ;
	}
	
}
public class LinkedList {
public Node head;
public Node current;
	

public void print() {
	Node current = head;
	while(current!=null){
		System.out.println("data  is " +  current.data);
		current=current.next;
	}
}

	
public void append(int data){
	

	Node newNode = new Node(data);
	if (head == null){
		head = newNode;
		head.next=null;
	} else {
		
		current = head;
		while(current.next!=null){
			current=current.next;
			
		}
		current.next = newNode;
	}
}

		
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList ll = new LinkedList();
ll.append(1);
ll.append(2);
ll.append(3);
ll.append(4);
ll.append(5);
ll.append(6);
ll.append(7);
ll.append(8);
ll.print();
	}

}
