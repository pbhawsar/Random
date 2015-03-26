
public class QueueArr {
	static int count = 0;
	int front;
	int rear;
	static int[] contents = new int[5];
	
	// insertion in queue is from rear;
	public static int insert(int item){
		
		int i =1;
	    int front = contents[0];
		if(count==0){
			// list is empty
		front = item;
		System.out.println("Front is "+front);
		count++;
		return item;
		
		}
		else {
			contents[i]=item;
			i++;
		}
		
		return item;
	
	}
	
	public void delete(){
		front = 0;
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(insert(1));
System.out.println(insert(2));
System.out.println(insert(3));

	}

}
