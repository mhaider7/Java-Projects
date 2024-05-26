// Mazin Haider
// CIS 207-700
// October 24, 2023
/* This program creates a class called SavingsAccount which has variables savingBalance to hold an accounts saving balance
 * and a static variable called annualInterestRate which will hold the same interest rate for each object of the class.
 * The class will have a method to calculate the savings balance with the monthly interest rate included for each of the 12 months.
 * The class will also have a static method to modify the interest rate which is held in a static variable
 * A testing class is then created to test the SavingsAccount class, initializing objects saver1 & saver2 to 2000 & 3000
 * The total savings balance will then be calculated and printed for each object with a interest rate of 4% & 5%
 */
package chapter08HW;

public class SavingsAccount {
	// Create the private static variable for the annual interest rate which will have one copy for every class
	private static double annualInterestRate;
	// Create a private instance variable to store the savings balance
	private double savingsBalance;
	
	// Create constructor to initialize the savings balance
	SavingsAccount(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}
	// Create a set method for the savings balance
	public void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}
	
	// Create the get method for the savings balance
	public double getSavingsBalance() {
		return savingsBalance;
	}
	
	// Create a method which will calculate the interest for the month
	public void calculateMonthlyInterest() {
		savingsBalance += ((savingsBalance * annualInterestRate) / 12);
	}
	
	// Create a static method which will modify the annual interest rate value
	public static void modifyInterestRate(double InterestRate) {
		annualInterestRate = InterestRate;
	}
}
