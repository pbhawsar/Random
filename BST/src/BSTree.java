class Node {
	Node left;
	Node right;
	int data;
	
	public Node(int newdata){
		left = null;
		right = null;
		data = newdata;
		
	}
	
}
public class BSTree {

	Node root;
	// creating and  binary tree with root null.
	public BSTree(){
		root = null;
	}
	
	public void run(){
		System.out.println("====================================================");
		//System.out.println("Buidling the binary tree with root value "+root.data);
		root=insert(root,25);
		root=insert(root,11);
		root=insert(root,15);
		
	}
	
	public Node insert(Node node, int data){
		if( node == null){
			node = new Node(data);
		}
		else {
		if(data<=node.data){
			node.left=insert(node.left,data);
			}
		else { 
			node.right = insert(node.right,data);
			}
		}
		return (node);
		}
	
		public void printTree(){
			printTree(root);
			System.out.println();
		}
		
		private void printTree(Node node){
			if(node == null) return;
			printTree(node.left);
			System.out.println(node.data + " ");
			printTree(node.right);
		}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
BSTree bst = new BSTree();
bst.run();
bst.printTree();
	}

}
