
public class PowerNum {

	
	
	public static int pow(int n, int  base){
		int pow =1;
		for (int i =0 ;i<n;i++){
			pow=base*pow;
			
		}
		return pow;
	}
	public static void main(String[] args) {
		
	System.out.println(pow(2,0));

	}

}
