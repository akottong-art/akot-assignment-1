package m3;

public class Onepoint11 { 
	public static void main (String[] args) {
		int population = 312032486;
		int secoundsInYear = 365 * 24 * 60 * 60;
		
		// Event per year
		int birth = secoundsInYear / 7;
		int death = secoundsInYear / 13;
		int immigrants = secoundsInYear / 45;
		
		// change in population
		int changePerYear = birth - death + immigrants;
		
		// population for the next 5 years
		for (int year = 1; year <= 5; year++) {
			population = population + changePerYear;
			System.out.println(population);
		}
		
		
	}
}