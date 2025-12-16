package m5;

import java.util.Scanner;
public class Exercise2_20 {
	public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
			// this is for the account balance .
			System.out.print("Enter the balance: ");
			double balance = input.nextDouble();

			// the annual interest rate.
			System.out.print("Enter the annual interest rate (e.g., 3.5): ");
			double annualInterestRate = input.nextDouble();

			// monthly interest.
			double interest = balance * (annualInterestRate / 1200);

			// result
			System.out.println("The interest for the next month is " + interest);
		}
    }
}
