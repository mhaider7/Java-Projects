package chapter08HW;

public class TrafficLightTest {

	public static void main(String[] args) {
		// Print the header
		System.out.println("Traffic Lights and their time duration");
		
		// Use and enhanced for loop to display the constants of the enum
		// Use static method .values() to retrieve the constants of the enum
		for (TrafficLight light : TrafficLight.values()) {
			// Using "light" enum variable gives the string interpretation of the identifier
			System.out.printf("%12s: %d seconds%n", light, light.getTime());
		}
	}

}
