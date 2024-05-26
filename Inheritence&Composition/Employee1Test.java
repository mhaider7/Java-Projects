package chapter09HW;

public class Employee1Test {

	public static void main(String[] args) {
		// Instantiate objects each from the subclass of the CompensationModel superclass
		CommissionCompensationModel cCompensationModel = new CommissionCompensationModel(300, 5);
		BasePlusCommissionCompensationModel bPCCompensationModel = new BasePlusCommissionCompensationModel(444, 5, 435);
		
		// Create 2 employee objects and pass into the constructor the 2 commission and base plus commission objects
		Employee1 employee1 = new Employee1("Bob", "Bobby", "222-222-2222", cCompensationModel);
		Employee1 employee2 = new Employee1("Justin", "Joe", "123-444-0525", bPCCompensationModel);
		
		// Display the data using the earnings method
		System.out.println("Here are the initial earnings.");
		System.out.printf("%s: $%.2f%n", "Employee 1 Earnings" , employee1.earnings());
		System.out.printf("%s: $%.2f%n", "Employee 2 Earnings" , employee2.earnings());
		
		// Change the data
		cCompensationModel.setGrossSales(233);
		cCompensationModel.setCommissionRate(6);
		bPCCompensationModel.setGrossSales(533);
		bPCCompensationModel.setCommissionRate(2);
		bPCCompensationModel.setBaseSalary(200);
		
		// Display the new earnings
		System.out.println("Here are the new earnings.");
		System.out.printf("%s: $%.2f%n", "Employee 1 Earnings" , employee1.earnings());
		System.out.printf("%s: $%.2f%n", "Employee 2 Earnings" , employee2.earnings());


	}

}
