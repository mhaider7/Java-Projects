// Mazin Haider
// CIS 207-700
// November 15, 2023
/* This program shows that a method in its own try block doesn't have to catch every error in the try.
 * The error can slip into other scopes to be handled as well.
 */

package chapter11HW;

public class Exercise11_21 {

	public static void main(String[] args) {
		// Create a try block which manually throws an exception
		try {
			// Call the static method
			someMethod();
		} catch (Exception exception) {
			// Print the error message for the try block
			System.err.println("Exception in someMethod was dealt within the main method");
		} 
	}
	
	// Create a static method which will throw the error
	public static void someMethod() {
		// Create the try statement
		try {
			// Throw the exception
			throw new RuntimeException();
		} catch(Exception exception) {
			// Re-throw the exception so it can be handled in a different scope
			throw exception;
		}
	}
	
}
