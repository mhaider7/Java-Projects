package chapter09HW;

public class Employee1 {
	// Declare the instance variables
	private final String firstName;
	private final String lastName;
	private final String socialSecurityNumber;
	private CompensationModel compensationModel;
	
	// Create the constructor which will pass in an object of CompensationModel;
	public Employee1(String firstName, String lastName, String socialSecurityNumber, CompensationModel compensationModel) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
		this.compensationModel = compensationModel;
	}
	
	// Create the set method for the CompensationModel class
	public void setCompensationModel(CompensationModel compensationModel) {
		this.compensationModel = compensationModel;
	}
	// Create the earnings method which will return a call to the CompensationModel's earning method
	public double earnings() {
		return compensationModel.earnings();
	}
	
}
