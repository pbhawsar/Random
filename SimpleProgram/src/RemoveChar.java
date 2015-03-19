import java.util.Scanner;


public class RemoveChar {

	
	public static String removechar(char c,String str){
		
		String word = " ";
		char rem = c;
		
		for(int i =0; i<str.length();i++){
			 
			if(str.charAt(i)==rem){
			// nothing
			}
			else {
				word+=str.charAt(i);
			}
			  
		}
		
		
		return word;
	} 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     @SuppressWarnings("resource")
	 Scanner sc = new Scanner(System.in);
     System.out.println("Enter the word!");
     String str = sc.next();
     System.out.println("Enter the char to be removed !");
     char c = sc.next().charAt(0);
     String result = removechar(c,str);
     System.out.println(result);
     
	}
}
