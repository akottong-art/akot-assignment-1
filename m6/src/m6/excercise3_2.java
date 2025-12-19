package m6;

import java.util.Scanner;
public class excercise3_2 {
	 public static void main(String[] args) {
	        // Generate three single-digit integers (0–9)
	        int number1 = (int)(Math.random() * 10);
	        int number2 = (int)(Math.random() * 10);
	        int number3 = (int)(Math.random() * 10);

	        try (// Create a Scanner
			Scanner input = new Scanner(System.in)) {
				// Prompt the user
				System.out.print(
				    "What is " + number1 + " + " + number2 + " + " + number3 + "? ");

				int answer = input.nextInt();

				// makes rhw answers
				if (answer == number1 + number2 + number3) {
				    System.out.println("You are correct!");
				} else {
				    System.out.println("Your answer is wrong.");
				    System.out.println(
				        number1 + " + " + number2 + " + " + number3 +
				        " should be " + (number1 + number2 + number3));
				}
			}
	    }
}
