package m8;

import java.util.Scanner;
public class Exercise4_5 {
	   public static void main(String[] args) {
	        try (Scanner input = new Scanner(System.in)) {
				// Prompt user
				System.out.print("Enter the number of sides: ");
				int n = input.nextInt();

				System.out.print("Enter the side length: ");
				double s = input.nextDouble();

				// Compute area
				double area = (n * s * s) / (4 * Math.tan(Math.PI / n));

				// Display result
				System.out.println("The area of the regular polygon is " + area);
			}
	    }
}
