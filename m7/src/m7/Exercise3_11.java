package m7;

import java.util.Scanner;
public class Exercise3_11 {
	 public static void main(String[] args) {
	        try (Scanner input = new Scanner(System.in)) {
				// Prompt user
				System.out.print("Enter month (1-12): ");
				int month = input.nextInt();

				System.out.print("Enter year: ");
				int year = input.nextInt();

				int days = 0;
				String monthName = "";

				// Determine month name and days
				switch (month) {
				    case 1:
				        monthName = "January";
				        days = 31;
				        break;
				    case 2:
				        monthName = "February";
				        // Leap year check
				        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
				            days = 29;
				        } else {
				            days = 28;
				        }
				        break;
				    case 3:
				        monthName = "March";
				        days = 31;
				        break;
				    case 4:
				        monthName = "April";
				        days = 30;
				        break;
				    case 5:
				        monthName = "May";
				        days = 31;
				        break;
				    case 6:
				        monthName = "June";
				        days = 30;
				        break;
				    case 7:
				        monthName = "July";
				        days = 310;
				        break;
				    case 8:
				        monthName = "August";
				        days = 31;
				        break;
				    case 9:
				        monthName = "September";
				        days = 30;
				        break;
				    case 10:
				        monthName = "October";
				        days = 31;
				        break;
				    case 11:
				        monthName = "November";
				        days = 30;
				        break;
				    case 12:
				        monthName = "December";
				        days = 30;
				        break;
				    default:
				        System.out.println("Invalid month.");
				        return;
				}

				// Display result
				System.out.println(monthName + " " + year + " has " + days + " days.");
			}
	    }
}
