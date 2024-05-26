// Mazin Haider
// CIS 207-700
// December 10, 2023
/* This applications uses the regionMatches method to compare 2 string input by the user. 
 * The strings will be compared at a specified range of indexes
 */

package ch14HW;

// Import the class Scanner from java.util package
import java.util.Scanner;

public class Exercise14_4 {

	public static void main(String[] args) {
		// Create the scanner object for user input
		Scanner scanner = new Scanner(System.in);
		
		// Prompt the user to enter the first string
		System.out.println("Enter the first string:");
		// Read in user input from the keyboard using the Scanner class's object
		String s1 = scanner.nextLine();
		
		// Prompt the user to enter the second string
		System.out.println("Enter the second string:");
		// Read in user input from the keyboard
		String s2 = scanner.nextLine();
		
		// Use regionMatches to compare the strings case-insensitively
		if (s1.regionMatches(true, 1, s2, 1, 5)) {							// If from index 1, up to 5 characters after s1 is equal to s2
			System.out.println("s1 is equal to s2 from index 1 to 5.");
		} else {															// If from index 1, up to 5 characters after s1 is not equal to s2
			System.out.println("s1 is not equal to s2 from index 1 to 5.");
		}
	}

}
