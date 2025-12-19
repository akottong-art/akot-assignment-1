package m6;

import java.util.Scanner;
public class listing3_2 {
	  public static void main(String[] args) {
		    try (Scanner input = new Scanner(System.in)) {
				System.out.print("Enter an integer: ");
				int number = input.nextInt();

				if (number % 5 == 0)
				  System.out.println("HiFive");

				if (number % 2 == 0)
				  System.out.println("HiEven");
			}
		  }
}
