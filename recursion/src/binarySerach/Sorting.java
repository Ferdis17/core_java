package binarySerach;


import java.util.Comparator;
import java.util.List;


public class Sorting {
	
	public void sort(List<Integer> numbers) {
		
		if(numbers == null || numbers.size() <=1)
			return;
		
		numbers.sort(Comparator.naturalOrder());
		
	}

}
