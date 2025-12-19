package m6;

import java.util.Scanner;
public class Exercise3_10 {
	 public static void main(String[] args) {
	        // Generate two random integers less than 100 (0–99)
	        int number1 = (int)(Math.random() * 100);
	        int number2 = (int)(Math.random() * 100);

	        try (// Create a Scanner
			Scanner input = new Scanner(System.in)) {
				// Prompt the user
				System.out.print(
				    "What is " + number1 + " + " + number2 + "? ");

				int answer = input.nextInt();

				// Check the answer
				if (number1 + number2 == answer) {
				    System.out.println("You are correct!");
				} else {
				    System.out.println("Your answer is wrong.");
				    System.out.println(
				        number1 + " + " + number2 + " should be " + (number1 + number2));
				}
			}
	    }
}
