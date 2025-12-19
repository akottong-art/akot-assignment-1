package m7;

import java.util.Scanner;
public class listing3_7 {
	  public static void main(String[] args) {
		    try (// Create a Scanner
			Scanner input = new Scanner(System.in)) {
				System.out.print("Enter a year: ");
				int year = input.nextInt();

				// Check if the year is a leap year 
				boolean isLeapYear = 
				  (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

				// Display the result in a message dialog box
				System.out.println(year + " is a leap year? " + isLeapYear);
			}   
		  } 
}
