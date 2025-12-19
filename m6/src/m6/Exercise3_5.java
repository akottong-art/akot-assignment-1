package m6;

import java.util.Scanner;
public class Exercise3_5 {
	public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
			// Prompt for today's day
			System.out.print("Enter today's day (Sunday is 0, Monday is 1, ..., Saturday is 6): ");
			int today = input.nextInt();

			// Prompt for number of days after today
			System.out.print("Enter the number of days after today: ");
			int daysAfter = input.nextInt();

			// find the future day
			int futureDay = (today + daysAfter) % 7;

			// todays dqte
			System.out.print("Today is ");
			printDay(today);

			// Display the future day
			System.out.print(" and the future day is ");
			printDay(futureDay);
		}
    }

    // print day names
    public static void printDay(int day) {
        switch (day) {
            case 0: System.out.print("Sunday"); break;
            case 1: System.out.print("Monday"); break;
            case 2: System.out.print("Tuesday"); break;
            case 3: System.out.print("Wednesday"); break;
            case 4: System.out.print("Thursday"); break;
            case 5: System.out.print("Friday"); break;
            case 6: System.out.print("Saturday"); break;
        }
    }
}
