package marius_eric;

public class SingleMaxmum {

	public static void main(String[] args) {

		System.out.println(hasSingleMaximum(new int[] { 1, 2, 3, 1, 0 }));
		System.out.println(hasSingleMaximum(new int[] { 18 }));
		System.out.println(hasSingleMaximum(new int[] { 1, 2, 3, 0, 1, 3 }));
		System.out.println(hasSingleMaximum(new int[] { 13, 1, 13, 2, 13, 0, 13, 1, 13 }));
		System.out.println(hasSingleMaximum(new int[] {}));
		System.out.println(hasSingleMaximum(new int[] { -6, -6, -6, -6, -6, -6, -6 }));

	}

	public static int hasSingleMaximum(int[] a) {
		if (a == null || a.length == 0) {
			return 0;
		}

		int currentMax = Integer.MIN_VALUE;
		int countMax = 0;

		for (int value : a) {
			if (value > currentMax) {
				currentMax = value;
				countMax = 1;
			} else {
				if (value == currentMax) {
					countMax++;
				}
			}
		}

		return countMax == 1 ? 1 : 0;
	}

}
