public class BinarySearch {

	public static void bs(int[] a, int lb, int ub, int k) {
		int position = (lb + ub) / 2;
		while ((a[position] != k) && (lb <= ub)) {
			if (a[position] < k) {
				lb = position + 1;
			} else {
				ub = position - 1;
			}
			position = (lb + ub) / 2;
		}
		if (lb <= ub) {
			System.out.println("Element Found !!");

		} else {
			System.out.println("The element could not be found");
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int key = 77;
		int[] arr = { 13, 24, 34, 46, 52, 63, 77, 89, 91, 100 };
		bs(arr, 0, 9, 77);

	}
}
