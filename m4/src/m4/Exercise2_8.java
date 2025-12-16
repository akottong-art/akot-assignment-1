package m4;

import java.util.Scanner;
public class Exercise2_8 {
	public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
			// Prompt user for time zone offset
			System.out.print("Enter the timme zone offset to GMT : ");
			int offset = input.nextInt();

			// Get total milliseconds since Jan 1, 1970
			long totalMilliseconds = System.currentTimeMillis();

			// Convert to total seconds
			long totalSeconds = totalMilliseconds / 1000;

			// Compute current second
			long currentSecond = totalSeconds % 60;

			// Convert to total minutes
			long totalMinutes = totalSeconds / 60;

			// Compute current minute
			long currentMinute = totalMinutes % 60;

			// Convert to total hours
			long totalHours = totalMinutes / 60;

			// Adjust hour based on time zone offset
			long currentHour = (totalHours + offset) % 24;
			if (currentHour < 0) {
			    currentHour += 24;
			}

			// Display the time
			System.out.println("Current time is " 
			    + currentHour + ":" 
			    + currentMinute + ":" 
			    + currentSecond);
		}
    }
}
