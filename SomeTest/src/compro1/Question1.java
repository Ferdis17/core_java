package compro1;

public class Question1 {

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
		// System.out.println(equvalentArrays(new int[] {}, new int[] {} ));

	}

	public static int equvalentArrays(int[] a1, int[] a2) {
		int trueValue = 1;

		for (int i = 0; i < a1.length && trueValue == 1; i++) {
			int falseValue = 0;
			for (int j = 0; j < a2.length && falseValue == 0; j++) {
				if (a1[i] == a2[j])
					falseValue = 1;

			}
			if (falseValue == 0)
				trueValue = 0;

		}
		for (int i = 0; i < a2.length && trueValue == 1; i++) {
			int falseValue = 0;
			for (int j = 0; j < a1.length && falseValue == 0; j++) {
				if (a2[i] == a1[j])
					falseValue = 1;

			}
			if (falseValue == 0)
				trueValue = 0;

		}
		return trueValue;
	}

}
