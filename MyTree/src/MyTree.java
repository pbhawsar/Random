import java.util.*;
import java.util.Map.Entry;

public class MyTree {

	static Set<Node> nodes = new HashSet<Node>();
	static HashMap<String, Node> hm = new HashMap<String, Node>();

	public static Node getNode(String name) {
		return hm.get(name);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node em11 = new Node("emp-11", "Address-emp11");
		nodes.add(em11);
		hm.put("e11", em11);
		Node em12 = new Node("emp-12", "Address-emp12");
		nodes.add(em12);
		hm.put("e12", em12);
		Node em13 = new Node("emp-13", "Address-emp13");
		nodes.add(em13);
		hm.put("e13", em13);
		Node manager1 = new Node("Manager-1", "Address-m1");
		manager1.addChild(11, em11);
		manager1.addChild(12, em12);
		manager1.addChild(13, em13);
		nodes.add(manager1);
		hm.put("m1", manager1);
		Node em21 = new Node("emp-21", "Address-emp21");
		nodes.add(em21);
		hm.put("e21", em21);
		Node em22 = new Node("emp-22", "Address-emp22");
		nodes.add(em22);
		hm.put("e22", em22);
		Node em23 = new Node("emp-23", "Address-emp23");
		nodes.add(em23);
		hm.put("e23", em23);

		Node manager2 = new Node("Manager-2", "Address-m2");
		manager2.addChild(21, em21);
		manager2.addChild(22, em22);
		manager2.addChild(23, em23);
		nodes.add(manager2);
		hm.put("m2", manager2);

		Node director = new Node("Director", "Address-d");
		nodes.add(director);
		director.addChild(1, manager1);
		director.addChild(2, manager2);
		director.print();
		Set<Node> visitedNodes = new HashSet<Node>();
		System.out.println("Address of emp-13 is "
				+ director.getAddress("emp-13", visitedNodes));
		visitedNodes = new HashSet<Node>();
		System.out.println("Parents of emp-12 is "
				+ director.printParentsOf("emp-12", visitedNodes));
		visitedNodes = new HashSet<Node>();
		System.out.println("Distance between e21 & e11 is ");
		Node n = getNode("e11");
		System.out.println(" Node n's name is :"+ n.name);
		System.out.println(n.findDistanceBetween("emp-21", visitedNodes));

		// System.out.println(em21.findDistanceBetween(em11, visitedNodes));
	}

}
