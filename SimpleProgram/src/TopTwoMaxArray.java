
public class TopTwoMaxArray {

	
	
	public static void topTwo(int[] arr){
		
		int max1 = 0;
		int max2 = 0;
		
		for(int num : arr){
			
			if(num>max1){
				max2=max1;
				max1=num;
				
			} else if(num>max2){
				max2=num;
			}
			
		}
		System.out.println("max1 "+max1+" max2 "+max2);
	}
	
	 public static void main(String[] args){
		 int[] arr = new int[]{1,3,2,4,3,2,1};
		 topTwo(arr);
	 }
}
