package m9;

import java.util.Scanner;
public class Exercise4_12 {
	   public static void main(String[] args) {
	        try (Scanner input = new Scanner(System.in)) {
				System.out.print("Enter a hex digit: ");
				String hex = input.next();

				if (hex.length() != 1) {
				    System.out.println("Invalid input");
				    return;
				}

				char ch = Character.toUpperCase(hex.charAt(0));
				int value;

				if (ch >= '0' && ch <= '9') {
				    value = ch - '0';
				} else if (ch >= 'A' && ch <= 'F') {
				    value = ch - 'A' + 10;
				} else {
				    System.out.println("Invalid input");
				    return;
				}

				// Convert to 4-bit binary
				String binary = String.format("%4s", Integer.toBinaryString(value))
				                     .replace(' ', '0');

				System.out.println("The binary value is " + binary);
			}
	    }
}
