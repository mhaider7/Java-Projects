// December 11, 2023
/* This application inputs at telephone number in the string form (555) 555-5555. The area code is extracted
 * into a token. Then, the second three letters and the last four letters are extracted into a token and
 * concatenated. The string is then displayed.
 */

package ch14HW;

// Import the scanner class from the java.util package
import java.util.Scanner;

public class Exercise14_8 {

	public static void main(String[] args) {
		// Create a new scanner object
		Scanner scanner = new Scanner(System.in);
		
		// Prompt the user to enter a telephone number in the specified format
		System.out.println("Input a telephone number in the string form (555) 555-555:");
		// Read in the phone number from the keyboard
		String string = scanner.nextLine();
		
		// Split the string with the space as a delimiter
		String[] token1 = string.split(" ");
		// Now split the second element of the string with - as a delimiter
		String[] token2 = token1[1].split("-");
		
		// Concatenate the 2 elements of token2 to connect the last 7 digits of the phone number
		String token3 = token2[0].concat(token2[1]);
		
		// Print the area code and the concatenated phone number
		System.out.printf("Area code: %s%n", token1);
		System.out.printf("Phone number: %s%n", token3);
	}

}
