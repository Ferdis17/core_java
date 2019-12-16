package binarySerach;

import java.util.List;

public class SearchInteger {

	// searching element int x into the list of Integer numbers
	public int search(List<Integer> numbers, int x) {

		// check if the list is not null
		if (numbers == null)
			return -1;

		// check if it has any element
		if (numbers.isEmpty())
			return -1;

		int i = 0; // index of the first element in the list
		int j = numbers.size() - 1; // index of the last element in the list

		if (numbers.get(i) == x)
			return i;
		
		if (numbers.get(j) == x)
			return j;

		if (x < numbers.get(i) || x > numbers.get(j))
			return -1;

		return binarySearch(numbers, i, j, x);
	}

	private int binarySearch(List<Integer> numbers, int i, int j, int x) {

		int m = (j + i) / 2; // index of the element in the meddle

		if (numbers.get(m) == x)
			return m;
		if (i == j)
			return -1;

		if (x < numbers.get(m)) {
			return binarySearch(numbers, i, m - 1, x);
		} else {
			return binarySearch(numbers, m + 1, j, x);
		}

	}

}
