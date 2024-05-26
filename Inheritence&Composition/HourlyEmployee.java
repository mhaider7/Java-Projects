package chapter09HW;
// HourlyEmployee inherits from the Employee using the "extends" keyword
public class HourlyEmployee extends Employee {
	// Create instance variables which hours work and wage per hour
	private double hours;
	private double wage;
	
	// Create a constructor for this class which will also call the superclass's constructor
	public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double hours, double wage) {
		// Use "super" keyword to call the super class constructor
		super(firstName, lastName, socialSecurityNumber);
		
		// Error check for the wage and for the hours
		if (hours < 0.0 || hours > 168.0) {
			throw new IllegalArgumentException("The hours must be > 0 and < 168.");
		}
		
		if (wage < 0.0) {
			throw new IllegalArgumentException("The wage must be non-negative.");
		}
		
		this.hours = hours;
		this.wage = wage;
	}
	
	// Create the set methods that contain the same error checking as in the constructor
	public void setHours(double hours) {
		if (hours < 0.0 || hours > 168.0) {
			throw new IllegalArgumentException("The hours must be > 0 and < 168.");
		}
		// Assign the argument to hours if it passes the error checking
		this.hours = hours;
	}
	
	public void setWage(double wage) {
		if (wage < 0.0) {
			throw new IllegalArgumentException("The wage must be non-negative.");
		}
		// Assign the argument to hours if it passes the error checking
		this.wage = wage;
	}
	
	// Create the getter methods for the hours and the wage
	public double getHours() 
	{ return hours; }
	
	public double getWage()
	{ return wage; }
	
	// Earning method will return the employee's earnings
	public double earnings() 
	{ return hours * wage; }
	
	// Override keyword is used to override the toString method in the Employee class
	@Override
	public String toString() {
		// Use the "super" keyword to access the original toString method from the superclass
		return String.format("%s%n%s: %.2f%n%s: $%.2f%n%s: $%.2f%n", super.toString(),
				"Hours", getHours(),
				"Wage", getWage(),
				"Earnings", earnings());
	}
	
}
