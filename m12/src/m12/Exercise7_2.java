package m12;

import java.util.Scanner;
public class Exercise7_2 {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];

        // Read 10 integers from the user
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextInt();
        }

        // Display the numbers in reverse order
        System.out.println("Numbers in reverse order:");
        for (int i = 9; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        input.close();
    }
}
