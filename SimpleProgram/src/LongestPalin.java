public class LongestPalin {

	public static String longestPalindrome(String str) {
		int maxPalinLen = 0;
		String longestPalin = null;
		int lenstr = str.length();

		for (int i = 0; i < lenstr; i++) {
			for (int j = i + 1; j < lenstr; j++) {
				int lensub = j - i;
				String curr = str.substring(i, j + 1);
				if (isPalindrom(curr)) {
					if (lensub > maxPalinLen) {
						longestPalin = curr;
						maxPalinLen = lensub;
					}
				}
			}
		}

		return longestPalin;
	}

	public static boolean isPalindrom(String substr) {

		for (int i = substr.length() - 1, j = 0; i >= j; i--, j++) {

			if (substr.charAt(i) == substr.charAt(j))
				;
			else
				return false;

		}

		return true;
	}


public static void main(String[] args){
    System.out.println(longestPalindrome("1234"));
    System.out.println(longestPalindrome("12321"));
    System.out.println(longestPalindrome("9912321456"));
    System.out.println(longestPalindrome("9912333321456"));
    System.out.println(longestPalindrome("12145445499"));
    System.out.println(longestPalindrome("1223213"));
    System.out.println(longestPalindrome("abb"));
}
}