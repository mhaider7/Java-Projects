// December 10, 2023
/* This applications uses class String's method compareTo to compare 2 strings entered by user input.
 * Then the application outputs whether the first inputed string is greater than, less than, or equal to the second inputed string.
 */
package ch14HW;

// import the Scanner class from java.util package 
import java.util.Scanner;

public class Exercise14_3 {

	public static void main(String[] args) {
		// Create a new Scanner object for user input
		Scanner scanner = new Scanner(System.in);
		
		// Prompt the user to enter the first string
		System.out.println("Enter the first string:");
		// Read in user input from the keyboard
		String str1 = scanner.nextLine();
		
		//Prompt the user to enter the second string
		System.out.println("Enter the second string:");
		// Read in user input from the keyboard
		String str2 = scanner.nextLine();
		
		// Use .compareTo method to compare the strings
		if (str1.compareTo(str2) == 0) { 						// If value returned equals 0
			System.out.println("str1 is equal to str2");
		} else if (str1.compareTo(str2) < 0) {					// If value returned is less than 0
			System.out.println("str1 is less than str2");		
		} else {												// If value returned is greater than 0
			System.out.println("str1 is greater than str2");	
		}
	}

}
