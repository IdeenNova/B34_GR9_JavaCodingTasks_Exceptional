package codingTasks.olga.week8;

import java.util.Arrays;

public class NuniqueIntegersThatSumUpTo0 {
    /*Write a function:
    that, given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0.
    The function can return any such array. For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5].
    The answer [1, -1,1,3] would be incorrect (because value 1 occurs twice).
    For N = 3 one of the possible answers is [-1,0,1]  (but there are many more correct answers).*/

    public static int[] generateUniqueIntegersSumZero(int N) {
        // Check if N is within the valid range
        if (N <= 1 || N >= 100) {
            throw new IllegalArgumentException("N must be between 1 and 100, exclusive.");
        }

        int[] result = new int[N];
        int index = 0;

        // Add pairs of positive and negative integers
        for (int i = 1; i <= N / 2; i++) {
            result[index++] = i;
            result[index++] = -i;
        }

        // If N is odd, add a zero
        if (N % 2 != 0) {
            result[index] = 0;
        }

        return result;
    }

    public static void main(String[] args) {
        // Test the function
        int[] array4 = generateUniqueIntegersSumZero(4);
        System.out.println("Array with N=4: " + Arrays.toString(array4));  // Example output: [1, -1, 2, -2]

        int[] array3 = generateUniqueIntegersSumZero(3);
        System.out.println("Array with N=3: " + Arrays.toString(array3));  // Example output: [1, -1, 0]
    }

}
