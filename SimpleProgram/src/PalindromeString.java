import java.util.Scanner;


public class PalindromeString {

	public static boolean checkPalin(String str){
	
		String word = str;
		
		for(int i =str.length()-1,j=0; i>=j;i--,j++){
			
			if(word.charAt(i)==word.charAt(j)){
		      // nothing
			}
			else 
				return false;
		}
		    
		   
		    return true;  
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the word !");
     String str = sc.next();
     boolean result = checkPalin(str);
     System.out.println(result);
     
	}
	
}
