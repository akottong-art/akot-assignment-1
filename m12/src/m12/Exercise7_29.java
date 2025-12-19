package m12;

import java.util.Random;
public class Exercise7_29 {
	   public static void main(String[] args) {
	        Random rand = new Random();
	        int count24 = 0;        // Count of picks yielding sum 24
	        int totalPicks = 100000; // Total simulations

	        for (int i = 0; i < totalPicks; i++) {
	            // Pick 4 cards
	            int[] cards = new int[4];
	            boolean[] picked = new boolean[52]; // Track picked cards to avoid duplicates

	            for (int j = 0; j < 4; j++) {
	                int card;
	                do {
	                    card = rand.nextInt(52); // 0-51
	                } while (picked[card]);
	                picked[card] = true;

	                int rank = card % 13 + 1; // 1=Ace, 11=Jack, 12=Queen, 13=King
	                cards[j] = rank;
	            }

	            int sum = 0;
	            for (int val : cards) {
	                sum += val;
	            }

	            if (sum == 24) {
	                count24++;
	            }
	        }

	        System.out.println("Number of picks yielding sum 24: " + count24);
	        System.out.println("Total picks simulated: " + totalPicks);
	    }
}
