package m7;

import java.util.Scanner;
public class Exercise3_14 {
	public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
			// Generate random coin flip: 0 = heads, 1 = tails
			int coin = (int)(Math.random() * 2);

			// Prompt user
			System.out.print("Guess the coin flip (0 for heads, 1 for tails): ");
			int guess = input.nextInt();

			// Check result
			if (guess == coin) {
			    System.out.println("Correct! You guessed right.");
			} else {
			    System.out.println("Incorrect.");
			}

			// Reveal coin result
			if (coin == 0) {
			    System.out.println("The coin landed on heads.");
			} else {
			    System.out.println("The coin landed on tails.");
			}
		}
    }
}
