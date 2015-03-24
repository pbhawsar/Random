import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class NotPresentInSecondArr {

	public static Integer[] notPresent(Integer[] arr1, Integer[] arr2) {

	  // array list to hold element which are not in array 2 from array 1
		ArrayList<Integer> dup = new ArrayList<Integer>();
		int dupcount =0;
		
		HashSet<Integer> setarr2 = new HashSet<Integer>();
		
		// add second array into the hashset
		for(int i: arr2){
			setarr2.add(i);
		}
        // add the first array, if it get successfully added to set
		//that means second array did not have the number
		
		for(int i:arr1){
			  if(setarr2.add(i)){
				  dup.add(i);
				  dupcount++;
			  }
		}
		return dup.toArray(new Integer[dupcount]);
	}
	
	public static void main(String[] args){
		
		for(int i : notPresent(new Integer[]{ 1, 2, 3, 5, 6}, new Integer[] { 1, 2, 4 })){
			System.out.println(i);
		}
	}
}
