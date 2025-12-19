package m11;

public class Exercise6_1 {
	  // Method to return the nth pentagonal number
    public static int getPentagonalNumber(int n) {
        return n * (3 * n - 1) / 2;
    }

    public static void main(String[] args) {
        int count = 0;

        // Display the first 100 pentagonal numbers
        for (int i = 1; i <= 100; i++) {
            System.out.printf("%7d", getPentagonalNumber(i));
            count++;

            // New line after every 10 numbers
            if (count % 10 == 0) {
                System.out.println();
            }
        }
    }
}
