// Mazin Haider
// CIS 207-700
// December 11, 2023
/* This application reads a line of text from the keyboard, then prints a table indicating the number of 
 * occurrences of each letter in the text. 
 */

package ch14HW;

// import the Scanner class from java.util package
import java.util.Scanner;

public class Exercise14_8a {

	public static void main(String[] args) {
		// Create the scanner object
		Scanner scanner = new Scanner(System.in);
		
		// Prompt the user to enter a line of text
		System.out.println("Enter a line of text:");
		// Read in the line of text
		String line = scanner.nextLine();
		
		// Create an array for the number of letters and for the letters themselves
		int[] alpha = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		char[] letter = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
		
		// Loop through each letter of the inputed string
		for (int index = 0; index < line.length(); index++) {
			// Use a switch statement to check if a certain letter appears at an index of the string, if so increment the element in the array
			switch (line.charAt(index)) {
			case 'a': alpha[0]++; break;
			case 'b': alpha[1]++; break;
			case 'c': alpha[2]++; break;
			case 'd': alpha[3]++; break;
			case 'e': alpha[4]++; break;
			case 'f': alpha[5]++; break;
			case 'g': alpha[6]++; break;
			case 'h': alpha[7]++; break;
			case 'i': alpha[8]++; break;
			case 'j': alpha[9]++; break;
			case 'k': alpha[10]++; break;
			case 'l': alpha[11]++; break;
			case 'm': alpha[12]++; break;
			case 'n': alpha[13]++; break;
			case 'o': alpha[14]++; break;
			case 'p': alpha[15]++; break;
			case 'q': alpha[16]++; break;
			case 'r': alpha[17]++; break;
			case 's': alpha[18]++; break;
			case 't': alpha[19]++; break;
			case 'u': alpha[20]++; break;
			case 'v': alpha[21]++; break;
			case 'w': alpha[22]++; break;
			case 'x': alpha[23]++; break;
			case 'y': alpha[24]++; break;
			case 'z': alpha[25]++; break;
			default: break;
			}
		}
		
		// Create a for loop to loop through the arrays, checking and printing how many times a letter appeared
		for (int i = 0; i < alpha.length; i++) {
			if (alpha[i] != 0)
			System.out.printf("Letter %c appears %d%n", letter[i], alpha[i]);
		}
	}

}
