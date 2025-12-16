package m4;

import java.util.Scanner;
public class Exercise2_2 {
	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
				// Prompt the user for radius and length
				System.out.print("Enter the radius of the cylinder: ");
				double radius = input.nextDouble();

				System.out.print("Enter the length of the cylinder: ");
				double length = input.nextDouble();

				// Compute area and volume
				double area = Math.PI * radius * radius;
				double volume = area * length;

				// Display results
				System.out.println("The area is " + area);
				System.out.println("The volume is " + volume);
			}
	    }
	}

