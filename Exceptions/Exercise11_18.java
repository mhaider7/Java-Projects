// Mazin Haider
// CIS 207-700
// November 15, 2023
/* This program shows what happens what a superclass type is placed within the parameters of a catch block
 * before all the subsequent catch blocks which contains subclasses as their parameters. 
 * The compiler generates an error saying the exception should already be dealt with by the first catch block
 * containing the superclass type.
 */

package chapter11HW;

// Import the Scanner class and the Exception class's subclasses from package java.util
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class Exercise11_18 {

	public static void main(String[] args) {
		// Create an object of the Scanner class and assign it to variable name input
		Scanner input = new Scanner(System.in);
		
		// Enter the code in the try block which prompts the user to enter a digit
		try {
			System.out.println("Enter a digit value: ");
			int number = input.nextInt();
			
		} catch (RuntimeException runtimeException) { // Exception parameter contains a superclass
			// Send a message to the user that the input value type was invalid
			System.err.println("The value entered must be a number.");
			// Read in the value into nextLine() method if needed
			input.nextLine();
		} catch (NoSuchElementException e) { // Exception parameter contains a subclass to the preceding catch parameter
			System.err.println("The value entered must be a number.");
			input.nextLine();
		} catch (InputMismatchException e) { // Exception parameter also contains a subclass to the preceding 2 catch parameters
			System.err.println("The value entered must be a number.");
			input.nextLine();
		}
		
	}

}
