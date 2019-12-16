package sorting;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelectionSortOnList {
	
	public static void main(String args[]) {
		
		List<String> myList = new ArrayList<>();
		
		myList = Arrays.asList("Kaka", "Messi", "Ronaldo","Zidane");
		
		List<Integer> nums = new ArrayList<>();
		nums = Arrays.asList(3,5,1,8,0,9);
		
		selectionSort(myList);
		selectionSort(nums);
		
		//Sorting Strings
		System.out.println(myList);
		 
		
		//sorting integer
		System.out.println(nums);
		
		
	}
	
	public static <T extends Comparable<T>> void selectionSort(List<T> myList) {
		
		if(myList == null || myList.size() <= 1)
			return;
		
		selectionSort(myList, 0, myList.size()-1);
		
	}

	private static <T extends Comparable<T>> void selectionSort(List<T> myList, int low, int high) {
		
		if(low < high) {//base case
			
			int indexOfMinElement = low;
			
			T min = myList.get(low);
			
			for(int k = low+1; k<=high; k++) {
				if (min.compareTo(myList.get(k)) > 0) {
					min = myList.get(k);
					indexOfMinElement = k;
				}
				
			}
			
			myList.set(indexOfMinElement, myList.get(low));
			myList.set(low, min);
			
			selectionSort(myList, low+1, high);
		
		}
	
		
		
	}

}
