package comparator;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee>{

//	@Override
//	public int compare(Employee e1, Employee e2) {
//		
//	return (int)(e1.getEmpId() - (e2.getEmpId()));
//}
	@Override
	public int compare(Employee e1, Employee e2) {
		
		return e1.getLastName().compareTo(e2.getLastName());
	}
}
