package m4;

import java.util.Scanner;
public class Exercise2_1 {
	   public static void main(String[] args) {
	        try (// Create a Scanner object
			Scanner input = new Scanner(System.in)) {
				// Prompt the user
				System.out.print("Enter a temperature in Celsius: ");
				double celsius = input.nextDouble();

				// Convert to Fahrenheit
				double fahrenheit = (9.0 / 5) * celsius + 32;

				// Display the result
				System.out.println("Temperature in Fahrenheit: " + fahrenheit);
			}
    }
}
