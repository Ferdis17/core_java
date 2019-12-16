package palendrome;

public class RecursivePalendrome {

	public static boolean isPalendrome(String s) {
		return isPalendromeHelper(s, 0, s.length() - 1);
	}

	private static boolean isPalendromeHelper(String s, int low, int high) {

		if (high <= low)
			return true;
		else if (s.charAt(low) != s.charAt(high))
			return false;
		else
			return isPalendromeHelper(s, low + 1, high - 1);

	}

	public static void main(String[] args) {
		
		System.out.println("is mom a palindrome? \n" + isPalendrome("mom"));
		System.out.println("is papa a palindrome? \n" + isPalendrome("papa"));

	}

}
