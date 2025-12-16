package m13;

public class exercise8_10 {
	public static void main(String[] args) {

        int[][] matrix = new int[4][4];

        // Fill matrix with random 0s and 1s
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int)(Math.random() * 2);
            }
        }

        // Print the matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Find row with the most 1s
        int maxRowIndex = 0;
        int maxRowCount = 0;

        for (int i = 0; i < matrix.length; i++) {
            int count = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                count += matrix[i][j];
            }

            if (count > maxRowCount) {
                maxRowCount = count;
                maxRowIndex = i;
            }
        }

        // Find column with the most 1s
        int maxColIndex = 0;
        int maxColCount = 0;

        for (int j = 0; j < matrix[0].length; j++) {
            int count = 0;
            for (int i = 0; i < matrix.length; i++) {
                count += matrix[i][j];
            }

            if (count > maxColCount) {
                maxColCount = count;
                maxColIndex = j;
            }
        }

        // Display results
        System.out.println("The largest row index: " + maxRowIndex);
        System.out.println("The largest column index: " + maxColIndex);
    }
}
