package m9;

import java.util.Scanner;
public class Exercise4_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for year and month
        System.out.print("Enter year: ");
        int year = input.nextInt();

        System.out.print("Enter month (first three letters, first letter uppercase): ");
        String month = input.next();

        int days = 0;
        boolean validMonth = true;

        switch (month) {
            case "Jan": days = 31; break;
            case "Feb":
                // Check for leap year
                if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
                    days = 29;
                else
                    days = 28;
                break;
            case "Mar": days = 31; break;
            case "Apr": days = 30; break;
            case "May": days = 31; break;
            case "Jun": days = 30; break;
            case "Jul": days = 31; break;
            case "Aug": days = 31; break;
            case "Sep": days = 30; break;
            case "Oct": days = 31; break;
            case "Nov": days = 30; break;
            case "Dec": days = 31; break;
            default:
                validMonth = false;
        }

        if (!validMonth) {
            System.out.println("The month is not a correct month name");
        } else {
            System.out.println("Number of days: " + days);
        }

        input.close();
    }
}
