package m5;

import java.util.Scanner;
public class Exercise2_23 {
	public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
			//  input.
			System.out.print("Enter the driving distance: ");
			double distance = input.nextDouble();

			System.out.print("Enter miles per gallon: ");
			double milesPerGallon = input.nextDouble();

			System.out.print("Enter price per gallon: ");
			double pricePerGallon = input.nextDouble();

			// caclutions for the cost of the trip.
			double cost = (distance / milesPerGallon) * pricePerGallon;

			// the results for it all.
			System.out.printf("The cost of driving is $%.2f%n", cost);
		}
    }
}
