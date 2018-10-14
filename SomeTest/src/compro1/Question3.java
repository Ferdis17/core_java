package compro1;

public class Question3 {

	public static void main(String[] args) {

		System.out.println(isRapidlyIncreasing(new int[] { 1, 3, 9, 27 }));
		System.out.println(isRapidlyIncreasing(new int[] { 1, 3, 200, 500 }));
		System.out.println(isRapidlyIncreasing(new int[] { 1 }));
		System.out.println(isRapidlyIncreasing(new int[] { 1, 3, 9, 26 }));
		System.out.println(isRapidlyIncreasing(new int[] { 1, 3, 7, 26 }));
		System.out.println(isRapidlyIncreasing(new int[] { 1, 3, 8, 26 }));

	}

	public static int isRapidlyIncreasing(int[] a) {

		int sum = a[0];

		for (int i = 1; i < a.length; i++) {

			if (a[i] <= 2 * sum)
				return 0;

			sum += a[i];
		}

		return 1;
	}
}
