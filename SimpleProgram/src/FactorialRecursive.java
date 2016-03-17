public class FactorialRecursive {

	public static int fact(int n) {

		if (n < 2) {
			return 1;
		}

		return n * fact(n - 1);

	}
  
	

	public static void main(String[] args) {
     
		System.out.println(fact(5));
		
		  int i,fact=1;  
  int number=5;//It is the number to calculate factorial    
  for(i=1;i<=number;i++){    
      fact=fact*i;    
  }    
  System.out.println("Factorial of "+number+" is: "+fact);    
	}

}
