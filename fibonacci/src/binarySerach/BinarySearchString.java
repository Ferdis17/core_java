package binarySerach;

public class BinarySearchString {
	
	public static void main(String args[]) {
		
		BinarySearchString binSearchString = new BinarySearchString();
		
		List<String> myList = Arrays.asList("fff","Kaka","Ona", "Mimi", "Chicago", "Boston");
		
		// sort myList
		Collections.sort(myList);
		
		System.out.println("Sorted list: " +myList);
		
		//searching a string
		int indexOfElement = binSearchString.search(myList, "Mimi");
		
		System.out.println("The element is at " + indexOfElement);
		
	}
	
	public int search(List<String> myList, String str) {
		
		if(myList == null || myList.size() == 0) {
			return -1;
		}
		
		int i = 0; // index of the first element in the list
		int j = myList.size() - 1; // index of the last element in the list
		
		if (myList.get(i).equals(str))
			return i;
		
		if (myList.get(j).equals(str))
			return j;
		
		 return binarySearch(myList,str, i, j);
	}

	private int binarySearch(List<String> myList, String str, int i, int j) {
		
		int m = (j + i) / 2; // index of the element in the middle

		if (str.equals(myList.get(m)))
			return m;
		
		if (i == j) // base case
			return -1;

		if (str.compareTo(myList.get(m)) < 0)  {
			return binarySearch(myList, str, i, m - 1);
		} else {
			return binarySearch(myList, str, m + 1, j);
		}
		
		
	}

}