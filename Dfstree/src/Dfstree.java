import java.util.*;

class Node {
	String name ;
	String address;
	ArrayList<Node> childNode = new ArrayList<Node>();

	public Node(String n, String a) {
		name = n ;
		address =a; 
	}
	
	public String toString(){
		return "Name : " +name+ " , " + " Address " +address ;
	}
	
	public  void addChild(Node cn){
		
		childNode.add(cn);
		
	}
	
	public String getAddress(String qname){
		if (name.equals(qname)){
			System.out.println("returning address for "+name);
			return "address is "+address;
		}
		
		for(int i =0;i<childNode.size();i++){
			String ret = childNode.get(i).getAddress(qname);
			if(ret !=null){
				System.out.println("returning address for name "+name);
				return ret;
			}
			
		}
		System.out.println("returning Null for "+name);
		return null ;
		
	}
	
	public void print(){
		System.out.println(this.toString());
		for(int i=0;i<childNode.size();i++){
			childNode.get(i).print();
			
		}
		//System.out.println("");
	}
	
	
}
public class Dfstree {
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node emp11 = new Node("employee11","address-emp11");
		Node emp12 = new Node("employee12","address-emp12");
		Node emp13 = new Node("employee13","address-emp13");
		

		
		Node manager1 = new Node("manager1","address-m1");
		manager1.addChild(emp11);
		manager1.addChild(emp12);
		manager1.addChild(emp13);
		
		Node emp21 = new Node("employee21","address-emp21");
		Node emp22 = new Node("employee22","address-emp22");
		Node emp23 = new Node("employee23","address-emp23");
		
		Node manager2 = new Node("manager2","address-m2");
		manager2.addChild(emp21);
		manager2.addChild(emp22);
		manager2.addChild(emp23);
		
		

		Node  director = new Node("director","d-1");
		director.addChild(manager1);
		director.addChild(manager2);
		director.print();

		System.out.println("address of emp 21 is "+director.getAddress("employee21"));
	}

}
