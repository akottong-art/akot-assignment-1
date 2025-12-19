package m12;

import java.util.Scanner;
public class Exercise7_1 {
	 public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        // Prompt for number of students
	        System.out.print("Enter the number of students: ");
	        int numberOfStudents = input.nextInt();

	        int[] scores = new int[numberOfStudents];

	        // Read student scores
	        System.out.println("Enter " + numberOfStudents + " scores:");
	        int best = 0;
	        for (int i = 0; i < numberOfStudents; i++) {
	            scores[i] = input.nextInt();
	            if (scores[i] > best) {
	                best = scores[i];  // track the best score
	            }
	        }

	        // Assign grades
	        for (int i = 0; i < numberOfStudents; i++) {
	            char grade;
	            if (scores[i] >= best - 10)
	                grade = 'A';
	            else if (scores[i] >= best - 20)
	                grade = 'B';
	            else if (scores[i] >= best - 30)
	                grade = 'C';
	            else if (scores[i] >= best - 40)
	                grade = 'D';
	            else
	                grade = 'F';

	            System.out.println("Student " + i + " score is " + scores[i] +
	                               " and grade is " + grade);
	        }

	        input.close();
	    }
}
