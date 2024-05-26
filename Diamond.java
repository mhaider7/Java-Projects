// This application creates a diamond shape made of asterisks using nested for loops
// Created on September 15, 2023
// Mazin Haider
package chapter4HWprograms;

public class Program4_24 {

	public static void main(String[] args) {
		int i, k, j, l; // Variable declaration so they can be used in each others headers
		// 2 loop statements, 1 for top & 1 for bottom
		for (k = 4; k >= 1; k--) { // For loop for each line
			for (j = 1; j <= k; j++) { // Decrementing the number of spaces each line
				System.out.print(" ");
			}
			for (l = 4; l >= k; l--) { // Prints a asterisk each line
				System.out.print("*");
				if (l != 4) // If the line isn't at the top, add an extra * to even the sides
					System.out.print("*"); 
			}
			System.out.println();
		}
		// Code for the bottom half of the diamond
		for (k = 3; k >= 1; k--) { 
			for (j = 4; j >= k; j--) { 
				System.out.print(" ");
			}
			for (l = 1; l <= k; l++) {
				System.out.print("*");
				if (l != 1) 
					System.out.print("*");
			}
			System.out.println();
		}
	}
}
