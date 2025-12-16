package m13;

public class exercise8_3 {
	public static void main(String[] args) {
		char[][] answers = {
		{'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
		{'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
		{'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
		{'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
		{'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
		{'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
		{'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
		{'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}
		};

		char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

		int[] scores = new int[answers.length];
		int[] students = new int[answers.length];

		// Initialize student numbers
		for (int i = 0; i < students.length; i++) {
		students[i] = i;
		}

		// Count correct answers
		for (int i = 0; i < answers.length; i++) {
		for (int j = 0; j < answers[i].length; j++) {
		if (answers[i][j] == keys[j]) {
		scores[i]++;
		}
		}
		}

		// Sort students by increasing scores
		for (int i = 0; i < scores.length - 1; i++) {
		for (int j = i + 1; j < scores.length; j++) {
		if (scores[i] > scores[j]) {
		// swap scores
		int tempScore = scores[i];
		scores[i] = scores[j];
		scores[j] = tempScore;

		// swap students
		int tempStudent = students[i];
		students[i] = students[j];
		students[j] = tempStudent;
		}
		}
		}

		// Display results
		for (int i = 0; i < students.length; i++) {
		System.out.println("Student " + students[i] +
		"'s correct count is " + scores[i]);
		}
	}
}
