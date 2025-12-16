package m4;

import java.util.Scanner;
public class Exercise2_4 {
	public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
			// Prompt the user
			System.out.print("Enter a value in pounds: ");
			double pounds = input.nextDouble();

			// Convert to kilograms
			double kilograms = pounds * 0.454;

			// Display the result
			System.out.println(pounds + " pounds is " + kilograms + " kilograms");
		}
    }
}
