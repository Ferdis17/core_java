package smallOnes;

public class RepeatedStringMatch {

	public static void main(String[] args) {
		
		System.out.println(repeatedStringMatch("ABCD", "BCDABCD"));

	}

	public static int repeatedStringMatch(String A, String B) {
		
		int i = 0;
		int j = 0;
		int result = 0;
		int k = 0;
		
		if (A.length() >= B.length()) {
			return -1;
		}

		while (j < B.length()) {

			if (A.charAt(i) == B.charAt(j)) {
				i++;
				j++;

				if (i == A.length()) {
					i = 0;
					result++;
				}
			} else {
				k++;
				if (k == A.length()) {
					return -1;
				}
				i = k;
				j = 0;
				result = 0;
			}
		}
		if (i > 0) {
			result++;
		}

		return result;
	}

}
