package chapter08HW;

public class RectangleTest {

	public static void main(String[] args) {
		// Create 2 objects of the Rectangle class which will call the default constructor
		Rectangle rectangle1 = new Rectangle();
		Rectangle rectangle2 = new Rectangle();
		
		// Set the width and length of rectangle1
		// The default values 1.0 will be overwritten
		rectangle1.setWidth(14.2);
		rectangle1.setLength(6.82);
		// Print out the values
		System.out.printf("Rectangle 1%nWidth: %.2f%nLength: %.2f%nArea: %6.2f%n%n", rectangle1.getWidth(), rectangle1.getLength(), rectangle1.getArea());
		
		// Set the width and length of rectangle2
		rectangle2.setWidth(1.8);
		// Create a try and catch to show the error
		try {
			rectangle2.setLength(24.32);
		} catch (IllegalArgumentException e) {
			System.out.printf("Exception: %s%n%n", e.getMessage());
		}
		rectangle2.setLength(12.11);
		// Print out the results
		System.out.printf("Rectangle 2%nWidth: %6.2f%nLength: %.2f%nArea: %7.2f%n%n", rectangle2.getWidth(), rectangle2.getLength(), rectangle2.getArea());
	}

}
