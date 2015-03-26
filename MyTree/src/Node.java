import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Node {
	String name;
	String address;
	ArrayList<Edge> childEdges = new ArrayList<Edge>();

	public Node(String n, String a) {
		name = n;
		address = a;
	}

	public void addChild(int distance, Node childNode) {
		childEdges.add(new Edge(distance, childNode));
		childNode.childEdges.add(new Edge(distance, this));
	}

	public String toString() {
		return "Name:" + name + ", Address: " + address;
	}

	public void print() {
		System.out.println(this.toString());
		/*
		 * for(int i =0;i<childEdges.size();i++){
		 * //System.out.println((Node)(childNodes.get(i)));
		 * childEdges.get(i).print(); }
		 */
	}

	public String getAddress(String qName, Set<Node> visited) {
		// System.out.println(this.toString());
		if (visited.contains(this)) {
			return null;
		} else {
			visited.add(this);
		}
		if (name.equals(qName)) {
			System.out.println("Returning address for " + name);
			return address;
		}

		for (int i = 0; i < childEdges.size(); i++) {
			Edge edge = childEdges.get(i);
			String ret = edge.next.getAddress(qName, visited);
			if (ret != null) {
				System.out.println("Returning address by one of my child "
						+ name);
				return ret;
			}
		}
		System.out.println("Returning Null for " + name);
		return null;
	}

	DistanceAndParent printParentsOf(String pname, Set<Node> visited) {
		if (visited.contains(this)) {
			return null;
		} else {
			visited.add(this);
		}
		DistanceAndParent ret = new DistanceAndParent();
		ret.path = new ArrayList<String>();
		if (name.equals(pname)) {
			System.out.println("address for " + name);
			ret.path.add(name);
			return ret;
		}
		for (int i = 0; i < childEdges.size(); i++) {
			DistanceAndParent childRet = childEdges.get(i).next.printParentsOf(
					pname, visited);
			if (childRet != null) {
				ret = childRet;
				ret.path.add(this.name);
				ret.totalDistance += childEdges.get(i).distance;
				return ret;
			}
		}
		return null;
	}

	public DistanceAndParent findDistanceBetween(String name, Set<Node> visited) {
		if (visited.contains(this)) {
			return null;
		} else {
			visited.add(this);
		}
		
		DistanceAndParent ret = new DistanceAndParent();
		ret.path = new ArrayList<String>();
		if (this.name.equals(name)) {
			ret.path.add(name);
			return ret;
		}
		
		for (int i = 0; i < childEdges.size(); i++) {
			DistanceAndParent childRet = childEdges.get(i).next
					.findDistanceBetween(name, visited);
			if (childRet != null) {
				ret = childRet;
				ret.path.add(this.name);
				ret.totalDistance += childEdges.get(i).distance;
				return ret;
			}
		}
		return null;
	}

	public int hashCode() {
		return name.hashCode();
	}

	public boolean equals(Object other) {
		Node otherNode = (Node) other;
		return this.name.equals(otherNode.name);
	}
}
