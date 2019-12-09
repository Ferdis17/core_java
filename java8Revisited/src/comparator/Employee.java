package comparator;

public class Employee {
	
	private long empId;
	private String firstName;
	private String lastName;
	
	public Employee(long empId, String firstName, String lastName) {
		
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public long getEmpId() {
		return empId;
	}

	public void setEmpId(long empId) {
		this.empId = empId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	
	
	

}
