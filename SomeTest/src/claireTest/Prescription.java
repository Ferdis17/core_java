package claireTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Prescription {
	
	private String id;
	private String drug;
	private int amount;
	private String patientName;
	
	// default constructor
	public Prescription() {
	}
	public Prescription(String drug) {
		this.drug = drug;
	}
	
	// constructor with two fields
	public Prescription(String id, String drug) {
		this.id = id;
		this.drug = drug;
	}
	
	
	// constructor with all fields
	public Prescription(String id, String drug, int amount, String patientName) {
		this.id = id;
		this.drug = drug;
		this.amount = amount;
		this.patientName = patientName;
	}
	// getter and setters below
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDrug() {
		return drug;
	}
	public void setDrug(String drug) {
		this.drug = drug;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	
	//override to string to add dollar sign "$" easily
	@Override
	public String toString() {
		return "Prescription [id=" + id + ", drug=" + drug + ", amount= $" + amount + ", patientName=" + patientName
				+ "]";
	}
	
	// Question 8, you can create a method that return that ArrayList
	public List<Prescription> getPrescriptions(){
		List<Prescription> prescriptions =  new ArrayList<>();
		
		Prescription one = new Prescription ("P1", "Synthroid" , 10, "Wanda Lock");
		Prescription two = new Prescription ("P2", "Vitamin" , 15 , "Clarissa Coleman");
		Prescription three = new Prescription ("P3", "Advil", 20, "Derek Welborn");
		
		prescriptions.add(one);
		prescriptions.add(two);
		prescriptions.add(three);
		
		return prescriptions;
	}
	
	//Question 8, if u don't want to use a method
//	List<Prescription> prescriptions =  new ArrayList<>(Arrays.asList(new Prescription("P1", "Synthroid" , 10, "Wanda Lock"), 
//			new Prescription("P2", "Vitamin" , 15 , "Clarissa Coleman"),
//			new Prescription("P3", "Advil", 20, "Derek Welborn")));
	public static void main(String[] args) {
		Prescription p1 = new Prescription("Vitamin");
		Prescription p2 = new Prescription("Vitamin");
		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));
	}

	
}
