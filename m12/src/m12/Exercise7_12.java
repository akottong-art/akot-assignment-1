package m12;

import java.util.Scanner;
public class Exercise7_12 {
	  // Method to reverse an array in place and return it
    public static int[] reverse(int[] array) {
        int n = array.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = array[i];
            array[i] = array[n - 1 - i];
            array[n - 1 - i] = temp;
        }
        return array;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];

        // Prompt the user to enter 10 numbers
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextInt();
        }

        // Reverse the array
        reverse(numbers);

        // Display the reversed array
        System.out.println("Reversed numbers:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        input.close();
    }
}
