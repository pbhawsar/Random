
public class FiboItertative {

	
	public static int[] fiboItr(int limit){
		int [] arr = new int[limit];
		arr[0]  = 0;
        arr[1] = 1;
		
		for(int i=2;i<limit;i++){
			arr[i]=arr[i-2]+arr[i-1];
			
		}
		return arr;
	}
	
	
	public static void main(String[] args) {
	 
	int[] result=fiboItr(10);
	for(int i =0;i<10;i++){
		System.out.println(result[i]);
	}

	}

}
