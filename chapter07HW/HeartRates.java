// Mazin Haider
// CIS 207-700
// October 14, 2023
/* This program creates a class which holds attributes of a persons name(first & last separate), date of birth
 * (day & month & year separate). The constructor will initialize these attributes and each attribute will
 *  have a get and a set method. The class has an instance method which calculates and returns the age from the user 
 *  entered date of birth. The class also has an instance method to calculate the maximum heart rate and the target
 *  heart rate.
 */
package chapter07HW;

public class HeartRates {
	// Create the instance variables for the class for each attribute
	private String firstName;
	private String lastName;
	private int month;
	private int day;
	private int year;
	// Define the constructor which will initialize the instance variables for each object
	public HeartRates(String fName, String lName, int m, int d, int y) {
		// "this." keyword is not required since the local and instance variables are named differently
		firstName = fName;
		lastName = lName;
		month = m;
		day = d;
		year = y;
	}
	// Create setter methods for each attribute
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setBirthMonth(int month) {
		this.month = month;
	}
	
	public void setBirthDay(int day) {
		this.day = day;
	}
	
	public void setBirthYear(int year) {
		this.year = year;
	}
	// Create the getter methods for each attribute
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public int getBirthMonth() {
		return month;
	}
	
	public int getBirthDay() {
		return day;
	}
	
	public int getBirthYear() {
		return year;
	}
	
	// Create a method that calculates and returns the persons age
	public int age() {
		// subtract the birth year from the current year and return the value(getBirthYear method isn't required)	
		return 2023 - year;
	}
	// Create a method that will calculate the person's maximum heart rate
	public int maximumHeartRate() {
		// Subtract 220 from the age given by the age() method and return the value
		return 220 - age();
	}
	// Create a method which calculates the minimum of the target heart rate
	public double minOfTargetHRRange() {
		return (age() * .50) + age();
	}
	// Create a method which calculates the maximum of the target heart rate
	public double maxOfTargetHRRange() {
		return (age() * 0.85) + age();
	}
	// Create a method that outputs the heart rate target range
	public void targetHeartRateRange() {
		System.out.printf("%.2f%% - %.2f%%", minOfTargetHRRange(), maxOfTargetHRRange());
	}
}
