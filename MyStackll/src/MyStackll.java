class Node {
	int val;
   Node next;
	
	public Node (int value){
		val=value;
		
	}
	public String toString(){
		return ""+ val;
	}
	
	
}
public class MyStackll {
	public Node top ;
    Node current;
	
	
	public void push(int item){
		Node newnode = new Node(item);


	   current = top;
		top = newnode;
		newnode.next=current;
		
	
		
	}
	
public int pop(){
			top=current;
			current=current.next;
		return top.val;
		
		
	}

	
	public void traverse(){
		 Node current = top;
		 while (current !=  null) {
			System.out.println("Stack is "+current.val); 
			 current= current.next;
		 }
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStackll ll = new MyStackll();
		ll.push(1);
		ll.push(2);
		ll.push(3);
		ll.push(4);
		ll.traverse();
	    ll.pop();
		ll.traverse();
		ll.pop();
		ll.traverse();
	}

}
