package m3;

public class Onepoint12 {
	public static void main (String[] args) {
		// values
		double miles = 24;
		double kilometersPerMile = 1.6;
		int hours = 1;
		int minutes = 40;
		int seconds = 35;
		
		//covert distance to kilometers
		double kilometers = miles * kilometersPerMile;
		
		//Convert time to hours
		double totalHours = hours
				+ (minutes / 60)
				+ (seconds / 3600);
		
		// average speed
		double averageSpeed = kilometers / totalHours;
		
		// Display result
		System.out.println("Average speed: " + averageSpeed + " km/h");
				
	}

}
