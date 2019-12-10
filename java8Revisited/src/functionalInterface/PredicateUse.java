package functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateUse {
	
	public static void main(String args []) {
		
		List<String> names =  Arrays.asList("Kik","Muri","Hen","Kib","Kaka");
		
		Predicate<String> s = (str) -> str.startsWith("K");
		
		for(String st: names) {
			
			if(s.test(st)) {
				System.out.println(st);
			}else {
				System.out.println(st + ": doesn't start with K");
			}
			
			
		}
	}

}
