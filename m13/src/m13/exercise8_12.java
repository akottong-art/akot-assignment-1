package m13;

import java.util.Scanner;
public class exercise8_12 {
	public static void main(String[] args) {
	    try (Scanner input = new Scanner(System.in)) {
			System.out.println("(0-single filer, 1-married jointly or " +
			  "qualifying widow(er), 2-married separately, 3-head of household)");
			System.out.print("Enter the filing status: ");
			int status = input.nextInt();

			System.out.print("Enter the taxable income: ");
			double income = input.nextDouble();

			// Tax rates
			double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};

			// Tax brackets for each status
			// 0: single
			// 1: married jointly
			// 2: married separately
			// 3: head of household
			int[][] brackets = {
			  {8350, 33950, 82250, 171550, 372950},   // single
			  {16700, 67900, 137050, 208850, 372950}, // married jointly
			  {8350, 33950, 68525, 104425, 186475},   // married separately
			  {11950, 45500, 117450, 190200, 372950}  // head of household
			};

			if (status < 0 || status > 3) {
			  System.out.println("Error: invalid status");
			  System.exit(1);
			}

			double tax = computeTax(income, brackets[status], rates);

			System.out.println("Tax is " + (int)(tax * 100) / 100.0);
		}
	  }

	  public static double computeTax(double income, int[] brackets, double[] rates) {
	    double tax = 0;
	    double previousCap = 0;

	    for (int i = 0; i < brackets.length; i++) {
	      if (income > brackets[i]) {
	        tax += (brackets[i] - previousCap) * rates[i];
	        previousCap = brackets[i];
	      } else {
	        tax += (income - previousCap) * rates[i];
	        return tax;
	      }
	    }

	    // Income above the highest bracket
	    tax += (income - previousCap) * rates[rates.length - 1];
	    return tax;
	  }
	}

