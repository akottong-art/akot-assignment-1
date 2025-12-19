package m7;

import java.util.Scanner;
public class Exercise3_19 {
	public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
			// Read three edges
			System.out.print("Enter three edges: ");
			double a = input.nextDouble();
			double b = input.nextDouble();
			double c = input.nextDouble();

			// Check triangle validity
			if (a + b > c && a + c > b && b + c > a) {
			    double perimeter = a + b + c;
			    System.out.println("The perimeter of the triangle is " + perimeter);
			} else {
			    System.out.println("The input is invalid.");
			}
		}
    }
}
