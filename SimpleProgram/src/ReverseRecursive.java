
public class ReverseRecursive {

	public  static String recReverse(String str){
		
		if (str.length()<2) 
			return str;
		else{
			return recReverse(str.substring(1))+ str.charAt(0);
		}
	}
	
	public static void main(String [] args){
		
		  System.out.println(recReverse("hello"));
		  
		  System.out.println(recReverse("pranay"));
		  System.out.println(recReverse("ReverseMe"));
		
	}
	
}
