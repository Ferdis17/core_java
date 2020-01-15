package lamdaAndStreams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class EmpTest{

	public static void main(String[] args) {

		List<Employee> emps = Arrays.asList(new Employee("AAA", 1000, "111"), new Employee("BBB", 2000, "222"),
				new Employee("CCC", 3000, "333"), new Employee("DDD", 4000, "444"),
				new Employee("EEE", 5000, "555"));

		List<String> ssnKey = Arrays.asList("111", "222", "333", "444", "555");
		
		HashMap<String, Employee> myHashMap = new HashMap<String, Employee>();

		for (int count = 0; count < ssnKey.size(); count++) {
			myHashMap.put(ssnKey.get(count), emps.get(count));
		}

		List<String> ssnCompair = Arrays.asList("111", "222", "333","666","777");
		EmployeeAdmin HMmethodObj = new EmployeeAdmin();
		
		System.out.println(HMmethodObj.prepareEmpReport(myHashMap, ssnCompair));
		System.out.println(HMmethodObj.prepareSsnReport(myHashMap, ssnCompair));

	}

}
