import java.lang.reflect.Array;
import java.util.Arrays;


public class Anagram {
  
	public static boolean checkAnagram(String str1, String str2) {
		
		if(str1.length() != str2.length()) {
			return false;
		}
		
		char[] char1 = str1.toCharArray();
		char[] char2 = str2.toCharArray();
		
		Arrays.sort(char1);
		Arrays.sort(char2);
		
		return Arrays.equals(char1,char2);
		
	}
	
	public static boolean isAnagram(String str1, String str2){
		
		if(str1.length() != str2.length()) {
			return false;
		}
		
		char[] char1 = str1.toCharArray();
		
		for(char c : char1) {
			int index = str2.indexOf(c);
			if(index != -1) {
				str2 = str2.substring(0, index)+str2.substring(index+1);
				
			}
			else
				return false;
			
		}
		
		return str2.isEmpty();
	}
	
	
	public static void main(String[] args) { 
		
		//System.out.println(checkAnagram("army", "mary"));
		System.out.println(isAnagram("army", "mary"));
	}
	
}
