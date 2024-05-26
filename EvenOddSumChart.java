// This program prompts the user to enter a count of odd numbers an prints a chart of their sum and then prompts the user again for a count of even numbers and print the sum of the even numbers. The application give the option to run as long as the user wants.
// Created September 22, 2023
// Mazin Haider
package chapter5HW;
// Import the Scanner class from the java.util package
import java.util.Scanner; 

public class Chapter5HW {
	
	public static void main(String[] args) {
		// Create variable input of Scanner type that will be assigned to a Scanner object to accept user input
		Scanner input = new Scanner(System.in);
		// Declare local variables
		int selection, oddInteger = 1, evenInteger = 2;
		// Create a do while loop to allow repeated task by the users choice
		do {
			// Prompt user to enter the number of odd integers to add up
			System.out.print("How many odd integers would you like to add? ");
			int value = input.nextInt();
			// Call the method that will print the table of odd sums
			table(value, oddInteger, "Odd");
			// Call the method that will print the total sum of the odd numbers
			int sumValue = sum(value, oddInteger);
			System.out.printf("The sum of the first %d odd integers is %d%n%n", value, sumValue);
			
			// Prompt user to enter the number of even integers to add up
			System.out.print("How many even integers would you like to add? ");
			value = input.nextInt();
			// Call the method that will print the table of even sums
			table(value, evenInteger, "Even");
			// Call the method that will print the total sum of the even numbers
			sumValue = sum(value, evenInteger);
			System.out.printf("The sum of the first %d even integers is %d%n%n", value, sumValue);
			
			// Prompt the user to enter again and read in a selection value (negative to exit)
			System.out.print("Do you want to add again? Enter a negative number to quit. ");
			selection = input.nextInt();
		} while (selection >= 0);
		
		
	}
	// Create a method that will print out a table of values
	public static void table(int numberCount, int typeValue, String type) {
		// Declare a local variable that will keep track of the sum
		int addedSum = 0;
		// Create the header and print out the table
		System.out.printf("Count   %s Integers   Sum%n", type);
		for (int count = 1; count <= numberCount; count++) {
			// Update the sum value
			addedSum += typeValue;
			System.out.printf("%3d%12d%10d%n", count, typeValue, addedSum);
			// Increment to the next even or odd number
			typeValue += 2;
		}
	}
	// Create a method that will print the total sum of the numbers
	public static int sum(int numberCount, int typeValue) {
		int addedSum = 0;
		// Add up the total sum of the even or odd numbers
		for (int count = 1; count <= numberCount; count++) {
			addedSum += typeValue;
			typeValue += 2;
		}			
			// Return the value of the final sum of all the values
			return addedSum;
	}
	
}
