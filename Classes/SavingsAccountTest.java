package chapter08HW;

// import the NumberFormat class from the java.text to format the currency
import java.text.NumberFormat;

public class SavingsAccountTest {

	public static void main(String[] args) {
		// Create an object of the Savings Account class called saver1 & saver2
		SavingsAccount saver1 = new SavingsAccount(2000.00);
		SavingsAccount saver2 = new SavingsAccount(3000.00);
		
		// Modify the interest rate to 4%
		SavingsAccount.modifyInterestRate(0.04);
		// Calculate the monthly interest for each of the 12 months
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		
		// Use the getCurrencyInstance static method and the format method to format the double value into the correct US currency string
		System.out.printf("Savings Balance with 4%% interest rate%nsaver1: %s%n", NumberFormat.getCurrencyInstance().format(saver1.getSavingsBalance()));
		System.out.printf("saver2: %s%n", NumberFormat.getCurrencyInstance().format(saver2.getSavingsBalance()));
		
		// Modify the interest rate to 5%
		SavingsAccount.modifyInterestRate(0.05);
		// Reset the savings balance to its initial values
		saver1.setSavingsBalance(2000.00);
		saver2.setSavingsBalance(3000.00);
		// Calculate the monthly interest
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		
		// Print the results again
		System.out.printf("%nSavings Balance with 5%% interest rate%nsaver1: %s%n", NumberFormat.getCurrencyInstance().format(saver1.getSavingsBalance()));
		System.out.printf("saver2: %s%n", NumberFormat.getCurrencyInstance().format(saver2.getSavingsBalance()));
	}

}
