// The application contains the array of objects which will each have its own data for the user to input
package chapter07HW;
// Import the Scanner class from the java.util package
import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		// Create a scanner object
		Scanner input = new Scanner(System.in);
		
		// Create an array of 10 objects(10 different accounts)
		Account[] accounts = new Account[10];
		String choice;
		// Create a do while loop which will ask the user whether to deposit or withdraw money into a certain account
		do {
			// Prompt the user to select an account
			System.out.printf("Which account do you want to enter(Enter 1-10)? ");
			int accountNumber = input.nextInt();
			// Error check whether the input was correct or not using a while loop
			while (accountNumber < 1 || accountNumber > 10) {
				System.out.printf("Invalid, please select a valid accout 1-10: ");
				accountNumber = input.nextInt();
			}
			// Call the method which contains the switch statement and the account selection to deposit or withdraw from
			selectAccount(accounts, accountNumber);
			
			//outputData();
			
			// Prompt the user to enter data for another account or not
			System.out.printf("%nDo you want to deposit or withdraw from another account? (Y or N) ");
			choice = input.next();
		} while(choice.equals("Y") || choice.equals("y"));
	}
	
	// Create a method which will hold a switch statement to process the users account selection
	// Pass in the array of objects and the users account number selection
	public static void selectAccount(Account[] accounts, int accNumber) {
		switch(accNumber) {
			case 1:
				System.out.printf("%nEntering account 1.%n"); 
				accountOptions(accounts[0]); 
				break;
			case 2: 
				System.out.printf("%nEntering account 2.%n"); 
				accountOptions(accounts[1]); 
				break;
			case 3: 
				System.out.printf("%nEntering account 3.%n"); 
				accountOptions(accounts[2]); 
				break;
			case 4: 
				System.out.printf("%nEntering account 4.%n"); 
				accountOptions(accounts[3]); 
				break;
			case 5: 
				System.out.printf("%nEntering account 5.%n"); 
				accountOptions(accounts[4]); 
				break;
			case 6: 
				System.out.printf("%nEntering account 6.%n"); 
				accountOptions(accounts[5]); 
				break;
			case 7: 
				System.out.printf("%nEntering account 7.%n"); 
				accountOptions(accounts[6]); 
				break;
			case 8: 
				System.out.printf("%nEntering account 8.%n"); 
				accountOptions(accounts[7]); 
				break;
			case 9: 
				System.out.printf("%nEntering account 9.%n"); 
				accountOptions(accounts[8]); 
				break;
			default: 
				System.out.printf("%nEntering account 10.%n"); 
				accountOptions(accounts[9]); 
				break;
		}
	}
	
	// Create a method to give the user option to withdraw or deposit into the certain account
	public static void accountOptions(Account account) {
		// Create a scanner object
		Scanner input = new Scanner(System.in);
		// Create a new object of the account class and assign it to the data passed in
		account = new Account("", 0.0);
		
		// Prompt the user to enter the name for the account
		System.out.printf("%nEnter the name for the account: ");
		String name = input.nextLine();
		// Enter the users input name into the object
		account.setName(name);
		// Prompt the user whether they want to deposit or withdraw from the account
		System.out.printf("Select from the following options for %s's account:%n", account.getName());
		System.out.printf("%n0 to withdraw%n1 to deposit%n%nEnter choice: ");
		int option = input.nextInt();
		
		// Error check using a while loop
		while (option != 0 && option != 1) {
			System.out.print("Invalid, please select 0 to withdraw or 1 to deposit.");
			option = input.nextInt();
		}
		
		// Create an else-if statement for the users option to withdraw or deposit
		if (option == 0) {
			// Prompt the user how much they want to withdraw
			System.out.printf("%nHow much do you want to withdraw: $");
			double withdraw = input.nextDouble();
			// Call the method to withdraw money from the account
			account.withdraw(withdraw);
			System.out.println("Complete.");
			
		} else if (option == 1) {
			// Prompt the user how much they want to deposit
			System.out.printf("How much do you want to deposit: $");
			double deposit = input.nextDouble();
			// Call the method to deposit into the account
			account.deposit(deposit);
			System.out.println("Complete.");
		}
	}
	

}
