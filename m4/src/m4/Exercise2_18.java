package m4;

public class Exercise2_18 {
	public static void main(String[] args) {

        // table title
        System.out.println("a      b      pow(a, b)");

        // the values
        for (int a = 1; a <= 5; a++) {
            int b = a + 1;

            // Math.pow returns a double, so we cast it to int
            int power = (int) Math.pow(a, b);

            // Print each row
            System.out.println(a + "      " + b + "      " + power);
        }
    }
}
