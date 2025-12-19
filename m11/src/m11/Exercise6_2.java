package m11;

public class Exercise6_2 {
	// Method to compute the sum of digits in an integer
    public static int sumDigits(long n) {
        int sum = 0;

        while (n != 0) {
            sum += n % 10;   // get last digit
            n /= 10;        // remove last digit
        }

        return sum;
    }

    // Test program
    public static void main(String[] args) {
        try (java.util.Scanner input = new java.util.Scanner(System.in)) {
			System.out.print("Enter an integer: ");
			long number = input.nextLong();

			System.out.println("The sum of digits is " + sumDigits(number));
		}
    }
}
