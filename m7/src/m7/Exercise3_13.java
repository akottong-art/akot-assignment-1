package m7;

import java.util.Scanner;
public class Exercise3_13 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
			// Prompt the user
			System.out.print(
			    "Enter the filing status:\n" +
			    "0 - Single filer\n" +
			    "1 - Married filing jointly\n" +
			    "2 - Married filing separately\n" +
			    "3 - Head of household\n" +
			    "Enter your choice: ");
			int status = input.nextInt();

			System.out.print("Enter the taxable income: ");
			double income = input.nextDouble();

			double tax = 0;

			// Compute tax based on filing status
			switch (status) {
			    case 0: // Single filer
			        tax = computeTax(income,
			                8350, 33950, 82250, 171550, 372950);
			        break;

			    case 1: // Married filing jointly
			        tax = computeTax(income,
			                16700, 67900, 137050, 208850, 372950);
			        break;

			    case 2: // Married filing separately
			        tax = computeTax(income,
			                8350, 33950, 68525, 104425, 186475);
			        break;

			    case 3: // Head of household
			        tax = computeTax(income,
			                11950, 45500, 117450, 190200, 372950);
			        break;

			    default:
			        System.out.println("Invalid filing status.");
			        System.exit(1);
			}

			// Display result
			System.out.printf("Tax is $%.2f%n", tax);
		}
    }

    // Method to compute tax based on brackets
    public static double computeTax(double income,
                                    double bracket1,
                                    double bracket2,
                                    double bracket3,
                                    double bracket4,
                                    double bracket5) {
        double tax;

        if (income <= bracket1)
            tax = income * 0.10;
        else if (income <= bracket2)
            tax = bracket1 * 0.10 +
                  (income - bracket1) * 0.15;
        else if (income <= bracket3)
            tax = bracket1 * 0.10 +
                  (bracket2 - bracket1) * 0.15 +
                  (income - bracket2) * 0.25;
        else if (income <= bracket4)
            tax = bracket1 * 0.10 +
                  (bracket2 - bracket1) * 0.15 +
                  (bracket3 - bracket2) * 0.25 +
                  (income - bracket3) * 0.28;
        else if (income <= bracket5)
            tax = bracket1 * 0.10 +
                  (bracket2 - bracket1) * 0.15 +
                  (bracket3 - bracket2) * 0.25 +
                  (bracket4 - bracket3) * 0.28 +
                  (income - bracket4) * 0.33;
        else
            tax = bracket1 * 0.10 +
                  (bracket2 - bracket1) * 0.15 +
                  (bracket3 - bracket2) * 0.25 +
                  (bracket4 - bracket3) * 0.28 +
                  (bracket5 - bracket4) * 0.33 +
                  (income - bracket5) * 0.35;

        return tax;
    }
}
