import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class PermuString {
	
	public static String permutation(String str) { 
	    permutation("", str); 
	    return str;
	}

	private static void permutation(String prefix, String str) {
	    int n = str.length();
	    if (n == 0) System.out.println(prefix);
	    else {
	        for (int i = 0; i < n; i++)
	        	
	           
	            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
	    }
	}
	
	public static Set<String> generatePerm(String input){
		
		Set<String> set = new HashSet<String>();
		 if(input == "") return set;
		 
		 Character a  = input.charAt(0);
		
		 if(input.length()>1){
			 input=input.substring(1);
			 Set<String> permSet = generatePerm(input);
			 
			 for(String x: permSet){
				 
				   for(int i =0;i<=x.length();i++){
					   set.add(x.substring(0, i)+a+x.substring(i));
				   }
			 }
		 }
		 else {
			 
			 set.add(a+"");
		 }
		return set ;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the word !");
     String str = sc.next();
     Set<String> result = generatePerm(str);
     System.out.println(result);
     
	}
}
