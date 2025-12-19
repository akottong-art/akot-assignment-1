package m10;

import java.util.Scanner;
public class Exercise5_32 {
	   public static void main(String[] args) {
	        // Generate the first digit (1–9 so it stays two-digit)
	        int digit1 = (int)(Math.random() * 9) + 1;

	        // Generate the second digit (0–9, must be different)
	        int digit2;
	        do {
	            digit2 = (int)(Math.random() * 10);
	        } while (digit2 == digit1);

	        // Combine digits into a two-digit number
	        int lottery = digit1 * 10 + digit2;

	        // Prompt the user
	        Scanner input = new Scanner(System.in);
	        System.out.print("Enter your lottery pick (two digits): ");
	        int guess = input.nextInt();

	        // Get digits from the guess
	        int guessDigit1 = guess / 10;
	        int guessDigit2 = guess % 10;

	        // Display the lottery number
	        System.out.println("The lottery number is " + lottery);

	        // Check the guess
	        if (guess == lottery) {
	            System.out.println("Exact match: you win $10,000");
	        } else if (guessDigit1 == digit2 && guessDigit2 == digit1) {
	            System.out.println("Match all digits: you win $3,000");
	        } else if (guessDigit1 == digit1 || guessDigit1 == digit2
	                || guessDigit2 == digit1 || guessDigit2 == digit2) {
	            System.out.println("Match one digit: you win $1,000");
	        } else {
	            System.out.println("Sorry, no match");
	        }

	        input.close();
	    }
}
