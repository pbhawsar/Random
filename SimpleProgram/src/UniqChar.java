import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;


public class UniqChar {

	
	public static void nonRepChar(String str){
		
		Map <Character,Integer> counts = new LinkedHashMap<Character,Integer>(str.length());
	     
		char[] ch = str.toCharArray();
		
		for (char c : ch){
			
			if(counts.containsKey(c)){
				counts.put(c,counts.get(c)+ 1);
			}
			else 
				counts.put(c, 1);
		}
		 // Get a set of the entries
	      Set set = counts.entrySet();
	      // Get an iterator
	      Iterator i = set.iterator();
	      // Display elements
	      while(i.hasNext()) {
	         Map.Entry me = (Map.Entry)i.next();
	         System.out.print(me.getKey() + ": ");
	         System.out.println(me.getValue());
	      }
	}	
	public static void main(String[] args){
		nonRepChar("swiss");
	}
}
