package comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		List<Employee> employees = Arrays.asList
				(new Employee(12,"Ferdis", "Zenok"),
				(new Employee(13,"MIkel", "Ho")),
						(new Employee(10,"Kaka", "Muo")
						));
		System.out.println("Unsorted list: ");
		
		for (Employee emp: employees) {
			System.out.println(emp);
		}
		System.out.println("===============================================");
		
		System.out.println("Sorted by emp id :");
		
		Collections.sort(employees, new EmployeeComparator());
		for (Employee emp: employees) {
			System.out.println(emp);
		}
	}

}
