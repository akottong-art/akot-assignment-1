package m12;

import java.util.Arrays;
public class Exercise7_15 {
	 // Method to return a new array without duplicates
    public static int[] eliminateDuplicates(int[] list) {
        int[] temp = new int[list.length];
        int uniqueCount = 0;

        for (int i = 0; i < list.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < uniqueCount; j++) {
                if (list[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                temp[uniqueCount] = list[i];
                uniqueCount++;
            }
        }

        // Copy unique elements into a new array of exact size
        int[] result = new int[uniqueCount];
        System.arraycopy(temp, 0, result, 0, uniqueCount);
        return result;
    }

    // Test program
    public static void main(String[] args) {
        int[] numbers = {2, 3, 2, 5, 5, 7, 3, 8, 9, 7};
        System.out.println("Original array: " + Arrays.toString(numbers));

        int[] uniqueNumbers = eliminateDuplicates(numbers);
        System.out.println("Array without duplicates: " + Arrays.toString(uniqueNumbers));
    }
}
