package m5;

import java.util.Scanner;
public class Exercise2_22 {
	public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
		
			System.out.print("Enter the amount (as an integer, e.g., 1156 for $11.56): ");
			int amount = input.nextInt();

			// Convert amount to cents.
			int remainingAmount = amount;

			// number of dollars
			int numberOfDollars = remainingAmount / 100;
			remainingAmount %= 100;

			// number of quarters.
			int numberOfQuarters = remainingAmount / 25;
			remainingAmount %= 25;

			// number of dimes.
			int numberOfDimes = remainingAmount / 10;
			remainingAmount %= 10;

			// number of nickels.
			int numberOfNickels = remainingAmount / 5;
			remainingAmount %= 5;

			// number of pennies.
			int numberOfPennies = remainingAmount;

			// results.
			System.out.println("Your amount consists of:");
			System.out.println("Dollars: " + numberOfDollars);
			System.out.println("Quarters: " + numberOfQuarters);
			System.out.println("Dimes: " + numberOfDimes);
			System.out.println("Nickels: " + numberOfNickels);
			System.out.println("Pennies: " + numberOfPennies);
		}
    }
}
