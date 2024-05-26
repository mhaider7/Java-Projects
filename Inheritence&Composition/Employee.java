// October 30, 2023
/* This program creates a HourlyEmployee class which inherits basic functions from a Employee class.
 * The HourlyEmplyee class adds hours of work data and wage rate for the worker. Also, the HourlyEmployee
 * class overrides the toString() method of the Employee class to include the hour, wage, and earnings.
 * A test class is then created to test the HourlyEmployee class
 */

package chapter09HW;

public class Employee {
	// Instance variables of Employee class are private since their copies don't need to be changed
	private final String firstName;
	private final String lastName;
	private final String socialSecurityNumber;
	
	// Create a constructor which will initialize the variables
	public Employee(String firstName, String lastName, String socialSecurityNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
	}
	
	// Accessor methods
	public String getFirstName()
	{ return firstName; }
	
	public String getLastName()
	{ return lastName; }
	
	public String getSocialSecurityNumber() 
	{ return socialSecurityNumber; }
	
	// toString method inherited from class Object is overridden to be the string representation of class Employee 
	public String toString() {
		return String.format("%s: %s%n%s: %s%n%s: %s", 
				"First name", firstName,
				"Last name", lastName,
				"Social security number", socialSecurityNumber);
	}
}
