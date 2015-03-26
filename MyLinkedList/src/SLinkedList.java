class Node {
	int data;
	Node next;
	
	public Node(int in){
		data = in;
	}
	
	public String toString(){
		return ""+data;
	}
}

public class SLinkedList{
	public Node head;
	int count;
	
    public SLinkedList(){;
		
	}
	
	public void append(int data){
		
		count++;
		Node newNode = new Node(data);
		if (head == null){
			head = newNode;
		} else {
			
			Node current = head;
			while(current.next!=null){
				current=current.next;
				
			}
			current.next = newNode;
		}
	}
	
	
	public void reverse(){
		Node currptr ; 
		Node prevptr;
		Node temp;
		currptr = head;
		prevptr =null;
		while(currptr != null){
			temp = prevptr;
			prevptr=currptr;
			currptr = currptr.next;
			prevptr.next=temp;			
		}
		head=prevptr;
		
		Node current = head;
		while(current!=null){
			System.out.println("data  is " +  current.data);
			current=current.next;
		}
	}
	public void insertAt( int data, int index){
		index--;
		count++;
		Node newnode = new Node(data);
		Node forward = getAt(index+1);
		Node reverse = getAt(index-1);
		for (int i =0; i<index;i++){
			reverse = forward;
			forward = forward.next;			
		}
		reverse.next = newnode;
		newnode.next = forward;
		
	}
	public int length(){
		return  count;
	}
	
	public Node getAt(int index){


		Node current= head;
		int i=0;
		while(i < index-1){
			
			//System.out.println("data is "+current.data);
			current=current.next;
		    i++;
		}
		return current;
	}
	
	public void deletAt(int index){
		
		Node current1 = getAt(index-1);
		Node current2 = getAt(index+1);
		current1.next=current2;
		count--;
		
	}
	
	public void deleteLast() {
		Node current = head;
		int i =1;
		while( i < length()-1){
			current=current.next;
			i++;
			}
		/*while(current.next.next!=null){
			System.out.println("data is " + current.data);
	
			current=current.next;
		}*/
		current.next=null;
		count --;
	}
	
	public void print() {
		Node current = head;
		while(current!=null){
			System.out.println("data  is " +  current.data);
			current=current.next;
		}
		//System.out.print("data is "+current.data);
	}
	
				
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SLinkedList ll = new SLinkedList();
        ll.append(1);
        ll.append(2);
        ll.append(3);
        ll.append(4);
        ll.append(5);
        ll.append(6);
        ll.append(7);
        System.out.println("insert at 4");
        ll.insertAt(9, 4);
       // System.out.println("delete at postion 3" );
     //   ll.deletAt(3);
        System.out.println("length of nodes is "+ ll.length());
        ll.print();
        System.out.println("reversing the linked list");
        ll.reverse();
      
     }

}
