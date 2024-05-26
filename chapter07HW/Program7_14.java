// Mazin Haider
// CIS 207-700
// October 14, 2023
/* This program modifies the program in figure 7.9 and condenses the repeated line of code
 * into a separate static method
 */
package chapter07HW;

public class Program7_14 {

	public static void main(String[] args) {
		// Create two instances of the Account class
		Account account1 = new Account("Jane Green", 50.00);
		Account account2 = new Account("John Blue", -7.53);
		
		// Call the static methods an pass in the objects
		display(account1);
		display(account2);
	}

	// Create a static method that will accept an object of class Account as a parameter to output data of the passed object
	public static void display(Account acc) {
		// Print the initialized name and balance
		System.out.printf("%s balance: $%.2f %n%n", acc.getName(), acc.getBalance());
		// Create a object of Scanner class to allow user input from the keyboard
		// Use of the fully qualified class name
		java.util.Scanner input = new java.util.Scanner(System.in);
		// Prompt the user for an amount to deposit
		System.out.printf("Enter deposit amount for %s's account: ", acc.getName());
		// Read a floating-point number from the keyboard using nextDouble()
		double depositAmount = input.nextDouble();
		System.out.printf("Depositing $%.2f into the account.%n", depositAmount);
		// Call the instance method to deposit the user entered amount
		acc.deposit(depositAmount);
		// Repeat the data to display the code
		System.out.printf("%s balance: $%.2f %n%n", acc.getName(), acc.getBalance());
	}
}
