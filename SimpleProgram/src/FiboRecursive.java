public class FiboRecursive {

	public static int fibo(int n) {
		// base case
		if (n < 2) {
			return n;
		}

		return fibo(n - 2) + fibo(n - 1);
	}

	public static void main(String[] args) {

		int index = 0;
		while (index < 10) {

			System.out.println(fibo(index));

			index++;

		}

	}
}
