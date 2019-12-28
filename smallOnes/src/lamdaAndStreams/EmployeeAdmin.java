package lamdaAndStreams;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeAdmin {
	
	public List<String> prepareSsnReport(HashMap<String, Employee> table, List<String> ssnums) {
		
		Stream<Employee> employees = table.values().stream();
		
		List<String> ssns = employees.map(s -> s.getSsn())
				.filter(s -> !ssnums.contains(s))
				.sorted()
				.collect(Collectors.toList());
		
		return ssns;
		
	}
	
	public List<Employee> prepareEmpReport(HashMap<String, Employee> table, List<String> ssnums){
		
		Stream<Employee> employees = table.values().stream();
		
		List<Employee> empList = employees
				.filter(s -> s.getSalary()>2000)
				.filter(s -> ssnums.contains(s.getSsn()))
				.collect(Collectors.toList());
				
		return empList;
	}
	

}
