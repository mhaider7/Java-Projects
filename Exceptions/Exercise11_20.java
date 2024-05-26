// Mazin Haider
// CIS 207-700
// November 15, 2023
/* This program illustrates re-throwing an exception through the use of chained exceptions. An exception
 * is thrown manually in a method which works up the chain of method calls. The re-thrown exception
 * is handled in the main function. Then, the stack trace of the exceptions are printed.
 */
package chapter11HW;

public class Exercise11_20 {

	public static void main(String[] args) {
		// Create a try block which will call someMethod
		try {
			someMethod();
		} catch (Exception exception) { // The catch block catches the exception
			// Print an error message disclosing where the exception was thrown
			System.err.println("Exception is handled in the main method.");
			// Print the stack trace which will include the exception information of someMethod2
			exception.printStackTrace();
		}
	}
	
	// Create a method that will call another method and will re-throw an exception which occurred in the called method
	public static void someMethod() throws Exception {
		// Create a try block which will call someMethod2
		try {
			someMethod2();
		} catch (Exception exception){ // The catch block catches the exception
			// Print an error message disclosing where the exception was thrown
			System.err.println("An exception was thrown in someMethod()");
			// Re-throw the exception which will be handled in the main method
			throw exception;
		}
	}
	
	// Create a method which will throw the initial exception and has a throws class for class Exception
	public static void someMethod2() throws Exception{
		// Manually throw an exception
		throw new Exception("An exception was thrown in someMethod2()");
	}

}
