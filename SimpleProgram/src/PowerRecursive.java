
public class PowerRecursive {

	public static int powrec(int base, int p){
		
		if(p==1) return base;
		return base*powrec(base, p-1);
		
		
	}
	
	public static void main(String [] args) {
		
		System.out.println(powrec(2, 3));
	}
	
}
