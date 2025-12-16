package m4;

import java.util.Scanner;
public class Exercise2_12 {
	public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
			// Ask the user for the airplane's acceleration
			System.out.print("Enter the airplane's acceleration (m/s^2): ");
			double acceleration = input.nextDouble();

			// Ask the user for the take-off speed
			System.out.print("Enter the take-off speed (m/s): ");
			double speed = input.nextDouble();

			// Calculate the minimum runway length
			double runwayLength = (speed * speed) / (2 * acceleration);

			// results
			System.out.println("The minimum runway length needed is "
			        + runwayLength + " meters.");
		}
    }
}
