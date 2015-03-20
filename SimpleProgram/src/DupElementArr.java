import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// we make hashmap and then use numbers as key and the occurrence as value
public class DupElementArr {

	static int max = 0;

	public static void dupElement(int[] arr) {

		Map<Integer, Integer> mp = new HashMap<Integer, Integer>(arr.length);

		for (int val : arr) {

			if (mp.containsKey(val)) {
				mp.put(val, mp.get(val) + 1);
			} else {
				mp.put(val, 1);
			}
		}

		// get set of entries
		Set<Entry<Integer, Integer>> set = mp.entrySet();
		// get iterator
		Iterator<Entry<Integer, Integer>> i = set.iterator();

		while (i.hasNext()) {
			Map.Entry<Integer, Integer> me = (Map.Entry<Integer, Integer>) i.next();
			// logic to print the max value of duplicate
			int val = (int) me.getValue();
			if (val > max) {
				max = val;
			}
           
			System.out.print(me.getKey() + ":");
			System.out.println(me.getValue());
			

		}
		 
		System.out.println("max value of duplicate " + max);
		
	}

	public static void main(String[] args) {

		int[] arr = new int[] { 1, 2, 3, 3, 4, 5, 6, 6, 6, 7, 0, 9 };
		dupElement(arr);
	}

}
