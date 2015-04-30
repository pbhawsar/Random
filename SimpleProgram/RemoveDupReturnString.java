import java.util.HashSet;
import java.util.Set;

public class RemoveDupReturnString {

	public static String rev(String str) {
        
	    String result = " ";
	    
	    Set set = new HashSet();
	    
	    char [] ch = str.toCharArray();
	    
	    for(char c : ch){
	    	if(set.add(c)){
	    		result+=c;
	    	}
	    }
		return result;
	}

	public static void main(String[] args) {
		System.out.println(rev("pranay"));
	}
}
