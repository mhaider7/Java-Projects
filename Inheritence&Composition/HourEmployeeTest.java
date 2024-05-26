package chapter09HW;

public class HourEmployeeTest {

	public static void main(String[] args) {
		// Instantiate the HourlyEmployee class with initial values
		HourlyEmployee employee = new HourlyEmployee("Mazin", "Haider", "111-111-1111", 30, 20);
		// Call the toString method from the HourlyEmployee class
		System.out.println(employee);
		
		// Use the setter methods
		employee.setHours(29);
		employee.setWage(25);
		
		// Display the new data 
		System.out.println("The new hours, wage, and earnings are:");
		System.out.printf("%s", employee);
		
	}

}
