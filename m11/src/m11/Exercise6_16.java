package m11;

public class Exercise6_16 {
	   // Method to return number of days in a given year
    public static int numberOfDaysInAYear(int year) {
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            return 366; // leap year
        } else {
            return 365; // non-leap year
        }
    }

    public static void main(String[] args) {
        // Test the method for years 2014 to 2034
        for (int year = 2014; year <= 2034; year++) {
            System.out.println(year + " has " +
                    numberOfDaysInAYear(year) + " days");
        }
    }
}
