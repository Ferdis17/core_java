package binarySerach;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Sorting sortList = new Sorting();// you can sort immediately will Collections method
		
		SearchInteger searching = new SearchInteger();
		
		List<Integer> numbers = Arrays.asList(1,4,8,3,90,29,30,10,2);
		
		//sort the list
		sortList.sort(numbers);
		
		int elementIndex = searching.search(numbers, 30);
		
		System.out.println("The element is at " +elementIndex);
		

	}

}
