// program to find missing numbers in a sorted array

public class MissinNum {
	
	
	
	private static final int[] findMissing(int[] data) {
	    if (data == null || data.length <= 1) {
	        // nothing missing.
	        return new int[0];
	    }
	    int first = data[0];
	    int last = data[data.length - 1];
	    int[] missing = new int[last - first - data.length + 1];
	    int missingCursor = 0;
	    int expect = first;
	    for (int value : data) {
	        while (expect < value) {
	            missing[missingCursor] = expect;
	            missingCursor++;
	            expect++;
	        }
	        expect++;
	    }
	    return missing;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int [] arr = new int[]{0,1,2,3,5,6,7,8,9,12,15};
     
      for(int val : findMissing(arr)){
    	  System.out.println(val);
      }
     
	}

}
