package m12;

public class Exercise7_8 {
	 // Method to compute average of int array
    public static double average(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return (double) sum / array.length;
    }

    // Method to compute average of double array
    public static double average(double[] array) {
        double sum = 0;
        for (double value : array) {
            sum += value;
        }
        return sum / array.length;
    }

    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5};
        double[] doubleArray = {1.5, 2.5, 3.5, 4.5, 5.5};

        System.out.println("Average of int array: " + average(intArray));
        System.out.println("Average of double array: " + average(doubleArray));
    }
}
