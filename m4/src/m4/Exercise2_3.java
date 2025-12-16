package m4;

import java.util.Scanner;
public class Exercise2_3 {
	 public static void main(String[] args) {
	        try (Scanner input = new Scanner(System.in)) {
				// Prompt the user
				System.out.print("Enter a value in feet: ");
				double feet = input.nextDouble();

				// Convert to meters
				double meters = feet * 0.305;

				// Display the result
				System.out.println(feet + " feet is " + meters + " meters");
			}
	    }
}
