public class Edge {
	int distance;
	Node next;

	public Edge(int dist, Node n) {

		distance = dist;
		next = n;
	}

	public void print() {

		System.out.println("Distance : " + distance);
		next.print();
	}
}
