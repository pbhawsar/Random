
public class LargetSmallestArrElement {

	 public static void largeSmallElement(int[] arr){
		 
		  int max = 0;
		  int min = 0;
		  
		  for(int i = 0 ;i<arr.length; i++){
			  
			  if(arr[i]>max){
				  max=arr[i];
			  } else if(arr[i]<min){
				  min=arr[i];
			  }
			 
			  
		  }
		  System.out.println("max is "+max);
		  System.out.println("min is "+min);
	 }
	
	 public static void main(String[] args){
		 largeSmallElement(new int[]{1,2,3,8,6,3,5,9,0});
	 }
	
}
