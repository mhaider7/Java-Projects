// Mazin Haider
// CIS 207-700
// October 14, 2023
/* This program modified the AccountTest class by creating an array of objects which will represent
 * 10 different accounts. The program ask\s the user to deposit or withdraw money from the account
 * until the user wants to stop
 */
package chapter07HW;

public class Account {
	// Create instance variables which hold the name and the balance of the account
	private String name;
	private double balance;
	
	// Create a constructor which can initialize the account
	public Account(String name, double balance) {
		this.name = name;
		
		if (balance > 0.0) 
			this.balance = balance;
	}
	
	// Create a deposit method which will add to the balance variable
	public void deposit(double depositAmount) {
		balance += depositAmount;
	}
	// Create a withdraw method which will subtract from the balance variable
	public void withdraw(double withdrawAmount) {

		if (withdrawAmount > balance) {
			System.out.println("Sorry, not enough money in the account to withdraw.");
		} else {
			balance -= withdrawAmount;
		}
	}
	// Getter method to return the balance for the account
	public double getBalance() {
		return balance;
	}
	// Setter method to set the name for the account
	public void setName(String name) {
		this.name = name;

	}
	// Getter method to return the name for the account
	public String getName() {
		return name;
	}
}
