package m11;

import java.util.Scanner;
public class Exercise6_4 {
	  // Method to display the integer in reverse order
    public static void reverse(int number) {
        while (number != 0) {
            System.out.print(number % 10);
            number /= 10;
        }
        System.out.println();
    }

    // Test program
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = input.nextInt();

        System.out.print("Reversed number: ");
        reverse(num);

        input.close();
    }
}
