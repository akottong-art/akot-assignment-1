package m10;

public class Exercise5_6 {
	   public static void main(String[] args) {
	        final double MILE_TO_KM = 1.609;

	        // Table header
	        System.out.println("Miles  Kilometers    |    Kilometers  Miles");
	        System.out.println("----------------------------------------------");

	        // Display tables side by side
	        for (int miles = 1, km = 20; miles <= 10; miles++, km += 5) {
	            double kilometers = miles * MILE_TO_KM;
	            double milesFromKm = km / MILE_TO_KM;

	            System.out.printf("%-6d %-13.3f |    %-11d %.3f%n",
	                    miles, kilometers, km, milesFromKm);
	        }
	    }
}
