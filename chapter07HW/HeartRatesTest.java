// This class creates an instance/object of the HeartRates class, it initializes the object and prints out its information
package chapter07HW;
// Import the Scanner class from the java.util package
import java.util.Scanner;

public class HeartRatesTest {

	public static void main(String[] args) {
		// Create an object of the Scanner class to allow user data input
		Scanner input = new Scanner(System.in);
		
		// Class instantiation expression
		// Initializes the instance variables by passing arguments to the constructor's parameter
		HeartRates heartRate1 = new HeartRates("", "", 0, 0, 0);
		// Prompt the user to enter the data
		
		System.out.print("Enter your first name: ");
		String firstName = input.next(); // Use next() so no white-spaces are read
		// Use the setter method to set the data entered by the user into the object
		heartRate1.setFirstName(firstName);
		// Repeat with the last name
		
		System.out.print("Enter your last name: ");
		String lastName = input.next(); // Use next() so no white-spaces are read
		// Use the setter method to set the data entered by the user into the object
		heartRate1.setLastName(lastName);
		
		
		// Prompt the user to input their birth month, birth day, and birth year
		System.out.print("Enter your birth month: ");
		int birthMonth = input.nextInt();
		heartRate1.setBirthMonth(birthMonth);
		
		System.out.print("Enter your birth day: ");
		int birthDay = input.nextInt();
		heartRate1.setBirthDay(birthDay);
		
		System.out.print("Enter your birth year: ");
		int birthYear = input.nextInt();
		heartRate1.setBirthYear(birthYear);
		
		
		// Print out the person's name by using the get instance method
		System.out.printf("%n%nHeart Rate data:%n%nFirst name: %s%n", heartRate1.getFirstName());
		System.out.printf("Last name: %s%n", heartRate1.getLastName());
		// Print out the person's date of birth
		System.out.printf("Date of birth: %02d/%02d/%d%n", heartRate1.getBirthMonth(), heartRate1.getBirthDay(), heartRate1.getBirthYear());
		// Print out the person's age
		System.out.printf("Age: %d%n", heartRate1.age());
		// Print out the person's max heart rate
		System.out.printf("Maximum heart Rate: %d%n", heartRate1.maximumHeartRate());
		// Print out the person's target heart rate range
		System.out.print("Target heart rate range: ");
		heartRate1.targetHeartRateRange();
	}

}
