package smallOnes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumOfTwoNumber {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list = Arrays.asList(30,20,150,100,40, 70, 60);
		
		System.out.println(numberOfPairs(list));

	}
	
	public static int numberOfPairs(List<Integer> l) {
		
		int result = 0;
		
		for(int i = 0; i<l.size(); i++) {
			for(int j = i+1; j<l.size(); j++) {
				if((l.get(i) + l.get(j)) % 60 == 0) {
					result++;
				}				
			}
		}		
		return result;
	}

}
