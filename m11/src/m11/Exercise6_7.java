package m11;

import java.util.Scanner;
public class Exercise6_7 {
	  // Method to compute future investment value
    public static double futureInvestmentValue(double investmentAmount,
                                                double annualInterestRate,
                                                int numberOfYears) {
        double monthlyInterestRate = annualInterestRate / 1200;
        return investmentAmount * Math.pow(1 + monthlyInterestRate,
                                            numberOfYears * 12);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter investment amount: ");
        double amount = input.nextDouble();

        System.out.print("Enter annual interest rate (in %): ");
        double rate = input.nextDouble();

        System.out.println("Years     Future Value");
        System.out.println("-----------------------");

        // Display table for years 1 to 30
        for (int years = 1; years <= 30; years++) {
            double futureValue = futureInvestmentValue(amount, rate, years);
            System.out.printf("%-10d %.2f%n", years, futureValue);
        }

        input.close();
    }
}
