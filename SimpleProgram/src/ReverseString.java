import java.util.Scanner;

public class ReverseString {
	
	public static void revString(String s){
		String [] sarr;
		sarr = s.split("\\s");
		int len = sarr.length;
		System.out.println("length of string is : "+len);
	
		for(int i=sarr.length-1;i>=0;i--){
			
			System.out.print(sarr[i]);
			System.out.print(" ");
			
		}
		
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter some string ");
		String str = sc.nextLine();
        System.out.println("You entered : "+str);
        // call the method
        revString(str);
        
	}

}