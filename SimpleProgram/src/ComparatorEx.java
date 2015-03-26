import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;




public class ComparatorEx {

	public static void main(String [] args){
		
		    TreeSet set = new TreeSet(new MyComparator());
		    set.add(20);
		    set.add(0);
		    set.add(15);
		    set.add(5);
		    set.add(10);
		    
		    System.out.print(set);
	}
	
}

class MyComparator implements Comparator{
	
	 public int compare(Object o1 , Object o2){
		 
		 Integer i1 = (Integer)o1;
		 Integer i2 = (Integer)o2;
		 
		 if(i1<i2) return 1;
		 else if(i1>i2) return -1;
		 else return 0;
	 }
}
