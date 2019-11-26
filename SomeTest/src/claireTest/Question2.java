package claireTest;

public class Question2 {

	public static void main(String[] args) {

		System.out.println(equvalentArrays(new int[] { 0, 1, 2 }, new int[] { 2, 0, 1 }));
		System.out.println(equvalentArrays(new int[] { 0, 1, 2, 1 }, new int[] { 2, 0, 1 }));
		System.out.println(equvalentArrays(new int[] { 2, 0, 1 }, new int[] { 0, 1, 2, 1 }));
		System.out.println(equvalentArrays(new int[] { 0, 5, 5, 5, 1, 2, 1 }, new int[] { 5, 2, 0, 1 }));
		System.out.println(equvalentArrays(new int[] { 5, 2, 0, 1 }, new int[] { 0, 5, 5, 5, 1, 2, 1 }));
		System.out.println(equvalentArrays(new int[] { 0, 2, 1, 2 }, new int[] { 3, 1, 2, 0 }));
		System.out.println(equvalentArrays(new int[] { 3, 1, 2, 0 }, new int[] { 0, 2, 1, 0 }));
		System.out.println(equvalentArrays(new int[] { 1, 1, 1, 1, 1, 1 }, new int[] { 1, 1, 1, 1, 1, 2 }));
		System.out.println(equvalentArrays(new int[] {}, new int[] { 3, 1, 1, 1, 1, 2 }));
		System.out.println(equvalentArrays(new int[] {}, new int[] {}));

	}

	public static int equvalentArrays(int[] a1, int[] a2) {
		int equivalent = 1;

		int i = 0;
		while (i < a1.length && equivalent == 1) {

			int isThere = 0;
			for (int j = 0; j < a2.length && isThere == 0; j++) {
				if (a1[i] == a2[j])
					isThere = 1;
			}
			if (isThere == 0)
				equivalent = 0;
			i++;

		}
		int k = 0;
		while (k < a2.length && equivalent == 1) {

			int isThere = 0;
			for (int j = 0; j < a1.length && isThere == 0; j++) {
				if (a2[k] == a1[j])
					isThere = 1;

			}
			if (isThere == 0)
				equivalent = 0;
			k++;
		}
		return equivalent;
	}

}
