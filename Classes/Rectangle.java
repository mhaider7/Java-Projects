// Mazin Haider
// CIS 207-700
// October 24, 2023
/* This program creates a Rectangle class and with instance variables length and width which defaults to 1. 
 * The methods of the class can set and get the length and width. Also, there is a method that calculates the area of the rectangle.
 * A program is created to test Rectangle class
 */

package chapter08HW;

public class Rectangle {
	// Create the instance variables length and width an provide them their default values
	private double width = 1.0;
	private double length = 1.0;
	
	// Create the set methods
	// The set methods will do bounds checking on the inputed length or width
	public void setWidth(double width) {
		// If the input value is in range assign it the the instance variable
		if (width > 0.0 && width < 20.0) {
			this.width = width;
		} else {
			// Throw an exception if the value is invalid
			throw new IllegalArgumentException("the width is out of range.");
		}
	}
	
	public void setLength(double length) {
		if (length > 0.0 && length < 20.0) {
			this.length = length;
		} else {
			throw new IllegalArgumentException("the length is out of range.");
		}
	}
	
	// Create the get methods
	public double getWidth() {
		return width;
	}
	
	public double getLength() {
		return length;
	}
	
	// Create a method which will calculate and return the area
	public double getArea() {
		return length * width;
	}
}
