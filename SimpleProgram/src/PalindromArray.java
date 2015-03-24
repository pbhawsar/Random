
public class PalindromArray {

	
	public static boolean checkPalin(int[] arr){
		
		for(int i=arr.length-1,j=0; i>=j ;i--,j++){
			 
			if(arr[i]==arr[j]){
				// do nothing
			}else
			return false;
		}
		
		return true;
	} 
	
	public static void main(String[] args){
		
		int [] arr = new int[]{1,2,3,2,1};
		
		System.out.println(checkPalin(arr));
	}
	
	
}
