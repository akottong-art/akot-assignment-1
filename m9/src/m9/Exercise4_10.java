package m9;

import java.util.Scanner;
public class Exercise4_10 {
	   public static void main(String[] args) {
	        try (Scanner input = new Scanner(System.in)) {
				int day = 0;
				char answer;

				// Set 1
				System.out.println(
				    "Is your birthday in Set 1?\n" +
				    " 1  3  5  7\n" +
				    " 9 11 13 15\n" +
				    "17 19 21 23\n" +
				    "25 27 29 31"
				);
				System.out.print("Enter Y for Yes and N for No: ");
				answer = input.next().charAt(0);

				if (answer == 'Y' || answer == 'y')
				    day += 1;

				// Set 2
				System.out.println(
				    "Is your birthday in Set 2?\n" +
				    " 2  3  6  7\n" +
				    "10 11 14 15\n" +
				    "18 19 22 23\n" +
				    "26 27 30 31"
				);
				System.out.print("Enter Y for Yes and N for No: ");
				answer = input.next().charAt(0);

				if (answer == 'Y' || answer == 'y')
				    day += 2;

				// Set 3
				System.out.println(
				    "Is your birthday in Set 3?\n" +
				    " 4  5  6  7\n" +
				    "12 13 14 15\n" +
				    "20 21 22 23\n" +
				    "28 29 30 31"
				);
				System.out.print("Enter Y for Yes and N for No: ");
				answer = input.next().charAt(0);

				if (answer == 'Y' || answer == 'y')
				    day += 4;

				// Set 4
				System.out.println(
				    "Is your birthday in Set 4?\n" +
				    " 8  9 10 11\n" +
				    "12 13 14 15\n" +
				    "24 25 26 27\n" +
				    "28 29 30 31"
				);
				System.out.print("Enter Y for Yes and N for No: ");
				answer = input.next().charAt(0);

				if (answer == 'Y' || answer == 'y')
				    day += 8;

				// Set 5
				System.out.println(
				    "Is your birthday in Set 5?\n" +
				    "16 17 18 19\n" +
				    "20 21 22 23\n" +
				    "24 25 26 27\n" +
				    "28 29 30 31"
				);
				System.out.print("Enter Y for Yes and N for No: ");
				answer = input.next().charAt(0);

				if (answer == 'Y' || answer == 'y')
				    day += 16;

				// Display result
				System.out.println("Your birthday is " + day + "!");
			}
	    }
}
