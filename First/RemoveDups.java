package First;

import java.util.Arrays;

public class RemoveDups {
    public static void main(String[] args) {
        String[] inputArray = {"horse", "dog", "cat", "horse", "dog"};
        String[] result = removeDuplicates(inputArray);
        System.out.println(Arrays.toString(result));
    }

    public static String[] removeDuplicates(String[] inputArray) {
        // Sort the input array
        Arrays.sort(inputArray);

        // Count the number of unique strings
        int uniqueCount = 0;
        for (int i = 0; i < inputArray.length - 1; i++) {
            if (!inputArray[i].equals(inputArray[i + 1])) {
                uniqueCount++;
            }
        }
        uniqueCount++; // Account for the last element

        // Create a new array to hold unique strings
        String[] result = new String[uniqueCount];
        result[0] = inputArray[0];
        int index = 1;
        for (int i = 1; i < inputArray.length; i++) {
            if (!inputArray[i].equals(inputArray[i - 1])) {
                result[index++] = inputArray[i];
            }
        }

        return result;
    }
}
