package m13;

import java.util.Scanner;

public class exercise8_1 {
    // Method that returns the sum of a specified column
    public static double sumColumn(double[][] m, int columnIndex) {
        double sum = 0;

        for (int i = 0; i < m.length; i++) {
            sum += m[i][columnIndex];
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create a 3-by-4 matrix
        double[][] matrix = new double[3][4];

        System.out.println("Enter a 3-by-4 matrix row by row:");

        // Read matrix values
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }

        // Display the sum of each column
        for (int col = 0; col < matrix[0].length; col++) {
            System.out.println(
                "Sum of the elements in column " + col + " is " + sumColumn(matrix, col)
            );
        }

        input.close();
    }
}
