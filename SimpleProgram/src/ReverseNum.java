public class ReverseNum {

	public static int reverse(int num) {
	
		int rev = 0;
		while (num != 0) {

			rev = rev * 10;
			rev = rev + num % 10;
			num = num / 10;

		}
		return rev;
	}

	public static void main(String[] args) {
		System.out.println(reverse(123));
	}

}
