import java.util.Arrays;
import java.util.BitSet;


public class MissingNum {
	
	
	
	// when only 1 num is missing 
	
	public static void oneMissing(int[] arr, int n){
		
		int sum = 0 ; // sum of num in array
	    int index = -1;
	    
	    for(int i =0;i<arr.length;i++){
	    	 
	    	if(arr[i]==0){
	    		index =i ;
	    	}else {
	    		sum+=arr[i];
	    	}
	    	
	    	
	    }
		// sum of array from 1 to length
	    int total = n*(n+1)/2;
	    System.out.println("missing number is  " + (total-sum) + " at index "+index);
	}

	// more than 1 num are missing
	public static void moreMissing(int [] arr, int n){
		
		int missingCount = n-arr.length;
		BitSet bitset = new BitSet(n); // bitset is special kinda array that holds bit value
		
		for(int num : arr){
			bitset.set(num-1);
		}
		System.out.println("Missing number in integer array "+ Arrays.toString(arr)+ " count "+n);
		int lastMissingIndex = 0;
		for(int i=0;i<missingCount;i++){
			lastMissingIndex = bitset.nextClearBit(lastMissingIndex);
			System.out.println(++lastMissingIndex);
		}
	}
	
	public static void main(String[] args){
		
		int[] arr = new int[]{1,2,4,6,7,9,10};
		int n = 10; // lenght of array
//		oneMissing(arr,n);
		moreMissing(arr, n);
		
	}
	
	
	
}
