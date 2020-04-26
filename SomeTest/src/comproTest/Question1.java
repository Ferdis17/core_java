package comproTest;

import java.util.HashSet;
import java.util.Set;

public class Question1 {

	public static void main(String[] args) {
		System.out.println(hasNValues(new int[] { 1, 2, 2, 1 }, 2));
		System.out.println(hasNValues(new int[] { 1, 1, 1, 8, 1, 1, 1, 3, 3 }, 3));
		System.out.println(hasNValues(new int[] {1, 2, 3, 4, 5, 6, 7, 8 ,9, 10} , 10));
		System.out.println(hasNValues(new int[] {1, 2, 2, 1} , 3));
		System.out.println(hasNValues(new int[] {1, 1, 1, 8, 1, 1, 1, 3, 3} , 2));
		System.out.println(hasNValues(new int[] {1, 2, 3, 4, 5, 6, 7, 8 ,9, 10}, 20));
		
	}
	public static int hasNValues(int[] arr, int n) {

		if (arr.length == 0 || n == 0)
			return 0;
		if (arr.length > 0 && n == 0)
			return 0;
		int size = 0;
		Set<Integer> newsize = new HashSet<>();

		for (int i = 0; i < arr.length; i++) {

			if (!newsize.contains(arr[i])) {
				newsize.add(arr[i]);
				size++;
			}
		}
		return size == n ? 1 : 0;
	}

}
