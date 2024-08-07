package codingTasks.madina.week8;

import java.util.ArrayList;
import java.util.List;

public class NuniqueIntegersThatSumUpTo0 {
    /*Write a function:
    that, given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0.
    The function can return any such array. For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5].
    The answer [1, -1,1,3] would be incorrect (because value 1 occurs twice).
    For N = 3 one of the possible answers is [-1,0,1]  (but there are many more correct answers).*/

    public static int[] generateNUniqueIntegersSumToZero(int N) {
        int[] result = new int[N];
        int sum = 0;

        // Fill the array with unique integers from -(N/2) to N/2, excluding 0 if N is even
        for (int i = 0; i < N - 1; i++) {
            result[i] = i - (N / 2);
            sum += result[i];
        }

        // Set the last element so that the sum of the array is zero
        result[N - 1] = -sum;

        return result;
    }

    public static void main(String[] args) {
        int N = 4;
        int[] result = generateNUniqueIntegersSumToZero(N);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}

