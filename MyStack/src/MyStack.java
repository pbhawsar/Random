class Stack {
	private int maxSize ;
	private int emptyStack;
	private int top;
	int count;
	private  char[] items ;
	
	public Stack(int size) {
		maxSize = size;
		emptyStack = -1;
		top =emptyStack;
		items = new char[maxSize];
	}
	
	public void push(char cr){
		count++;
		if (top == maxSize-1){
			System.out.println("the stack is full\n");			
		}
		else {
			top =top +1 ;
			items[top]= cr;
		}
		
	}
	
	public char pop() {
		count--;
		if( top == -1){
			System.out.println("the stack is empty");
		}
		
			top = top -1;
			return items[top];
			
		
	}
	public void traverse(){
		
		for(int i =top;i>=0;i--){
			System.out.println("stack element at "+" "+count+" "+"is "+items[i]);
			//top--;
		}
			
		
	}
	
}


public class MyStack {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stack st = new Stack(10);
st.push('A');
st.push('B');
st.push('c');
st.traverse();
st.pop();
st.traverse();
	}

}
