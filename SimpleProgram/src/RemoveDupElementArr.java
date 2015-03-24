import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDupElementArr {

	public static Integer[] removeDup(Integer[] arr) {

		HashSet<Integer> set = new HashSet<Integer>();
		ArrayList<Integer> alist = new ArrayList<Integer>();
        int count = 0;
		for (int i : arr) {
			if(set.add(i)){
				alist.add(i);
				count++;
			};
		}

		return alist.toArray(new Integer[count]);

	}
    
	public static void main (String [] arg){
		 
		for(int i : removeDup(new Integer[]{1,2,3,4,5,2,4,6,7,8,8,7})){
			System.out.print(i);
			System.out.print(" ");
		}
	}
}
