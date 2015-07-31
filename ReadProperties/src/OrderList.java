import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class OrderList {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		File file = new File("test1");
		
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		
		Scanner input = new Scanner(file);
		
		while(input.hasNextLine()){
            String str = input.nextLine(); 
           
			String [] info  =  str.split("\\s+");
			
		    Integer orderno = Integer.parseInt(info[0]);
		    Integer ordercost = Integer.parseInt(info[1]);
		   
		    if(hm.containsKey(orderno)){
		    	hm.put(orderno, hm.get(orderno)+ordercost);
		    }else {
		    	hm.put(orderno, ordercost);
		    }
           
			
		}
		
		
		for(Map.Entry<Integer,Integer> entry:hm.entrySet()){
			System.out.println("OrderNo " + entry.getKey()+ " OrderCost "+entry.getValue() );
			
		}
		

	}

}
