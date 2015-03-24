
public class SumRecursion {

	public static int total(int num){
		
		int sum = 0;
		
		while(num!=0){
			
			sum =sum+num%10;
			num=num/10;
		}
		return sum;
	}
	
	// recursive approach 
	
	public static int totalRec(int num){ 
		if(num%10==0) return num;
		return num%10+ totalRec(num/10);
	}
	
	public static void main(String [] args){
		System.out.println(total(1236));
	}
}
