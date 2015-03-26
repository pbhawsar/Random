// creating a simple linked list of three nodes
public class A {

	int datamember ;
	static A next ;

public A( A next) {
	append(next);
		// TODO Auto-generated constructor stub
	}

public A append(A next){
	
	if (next== null)
	A.next = next;
	return next;
	
}

public String toString(){
	
	
	return next.toString();
	
}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A a1 = new A(null);
		A a2 = new A(null);
		A a3 =new A(null);
		A a4=new A(null);
		a1.datamember=1;
		a1.next =  a2 ;
	   a2.datamember=2;
	   a2.next=a3;
	   a3.datamember=3;
	   a3.next=null;
	   
	   System.out.println("value for node 1 is "+ a1.datamember);
	   System.out.println("value for node 2 is "+ a2.datamember);
	   System.out.println("value for node 3 is "+ a3.datamember);
	   
		// To insert a new node say a4 in between a2 and a3
	   
	  
	   a4.datamember=4;
	   a2.next=a4;
	   a4.next=a3;
	   a3.next=null;
	   System.out.println("value of node 4 is "+ a4.datamember);
	   
	   
	   // To delete a node say a4 from the linked list from between a2 and a3
	   
	   a2.next=a3;
	   a3.next=null;
	   
	   
	}

}
