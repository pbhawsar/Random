import java.util.HashSet;
import java.util.Set;

public class ArraySumUsingSet {

	public static void printPair(int[] arr, int sum) {

		Set set = new HashSet();

		if (arr.length < 2) {
			return;
		}

		for (int val : arr) {

			int target = sum - val;

			if (!set.contains(target)) {
				set.add(val);
			} else { 
				System.out.println("printing pairs " + val +" "+target);
			}
		}

	}

	public static void main(String[] args) {
		ArraySumUsingSet
				.printPair(new int[] { 0, 14, 0, 4, 7, 8, 3, 5, 7 }, 11);

	}
}
