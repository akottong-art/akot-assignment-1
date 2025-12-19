package m8;

import java.util.Scanner;
public class Exercise4_1 {
	  public static void main(String[] args) {
	        try (Scanner input = new Scanner(System.in)) {
				// Prompt user
				System.out.print("Enter the length from the center to a vertex: ");
				double r = input.nextDouble();

				// Compute side length
				double s = 2 * r * Math.sin(Math.PI / 5);

				// Compute area
				double area = (5 * s * s) / (4 * Math.tan(Math.PI / 5));

				// Display result
				System.out.println("The area of the pentagon is " + area);
			}
	    }
}
