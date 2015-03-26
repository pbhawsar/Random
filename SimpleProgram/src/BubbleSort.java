
public class BubbleSort {

	// this sorting will work by comparing each element of the array with one another
	
	
	public static int[] sort(int [] arr){
		
		int temp=0;
		boolean flag =true;  // use to keep track of the iteration of one complete traversal
		
		while(flag){
			
			flag =false;
			
			for(int i=0; i<arr.length-1;i++){
				  if(arr[i]>arr[i+1]){
					  temp=arr[i];
					  arr[i]=arr[i+1];
					  arr[i+1]=temp;
					  flag=true;
				  }
			}
		}
		return arr;
	}
	
	public static void main(String [] args){
		
		int [] arr = new int[]{84,69,76,86,94,91};
		
		int [] result = sort(arr);
		
		for(int res : result){
			System.out.print(res);
			System.out.print(" ");
		}
	}
	
	
	
	
	
}
