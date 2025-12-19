package m12;

import java.util.Scanner;

public class Exercise7_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt for number of students
        System.out.print("Enter the number of students: ");
        int n = input.nextInt();

        String[] names = new String[n];
        double[] scores = new double[n];

        // Read student names and scores
        for (int i = 0; i < n; i++) {
            System.out.print("Enter student " + (i + 1) + " name: ");
            names[i] = input.next(); // assumes name has no spaces
            System.out.print("Enter student " + (i + 1) + " score: ");
            scores[i] = input.nextDouble();
        }

        // Sort students by scores in decreasing order using bubble sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (scores[j] < scores[j + 1]) {
                    // Swap scores
                    double tempScore = scores[j];
                    scores[j] = scores[j + 1];
                    scores[j + 1] = tempScore;

                    // Swap corresponding names
                    String tempName = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = tempName;
                }
            }
        }

        // Print names in decreasing order of scores
        System.out.println("\nStudents in decreasing order of scores:");
        for (int i = 0; i < n; i++) {
            System.out.println(names[i] + " - " + scores[i]);
        }

        input.close();
    }
}
