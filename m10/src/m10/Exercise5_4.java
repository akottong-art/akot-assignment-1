package m10;

public class Exercise5_4 {
	   public static void main(String[] args) {
	        final double MILE_TO_KM = 1.609;

	        // Table header
	        System.out.println("Miles\tKilometers");
	        System.out.println("--------------------");

	        // Display conversion table
	        for (int miles = 1; miles <= 10; miles++) {
	            double kilometers = miles * MILE_TO_KM;
	            System.out.printf("%-5d\t%.3f%n", miles, kilometers);
	        }
	    }
}
