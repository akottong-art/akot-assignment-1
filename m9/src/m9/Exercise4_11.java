package m9;

import java.util.Scanner;
public class Exercise4_11 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
			System.out.print("Enter an integer between 0 and 15: ");
			int number = input.nextInt();

			if (number >= 0 && number <= 15) {
			    String hex;

			    if (number < 10) {
			        hex = String.valueOf(number);
			    } else {
			        hex = String.valueOf((char) ('A' + number - 10));
			    }

			    System.out.println("The hex value is " + hex);
			} else {
			    System.out.println("Invalid input");
			}
		}
    }
}
