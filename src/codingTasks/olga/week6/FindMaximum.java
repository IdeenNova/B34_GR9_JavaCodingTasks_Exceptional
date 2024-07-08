package codingTasks.olga.week6;

public class FindMaximum {
    //Write a method that can find the maximum number from an int Array


    public static void main(String[] args) {
        int[] arr = {10, 5, 8, 20, 3};
        int max = findMax(arr);
        System.out.println("Maximum number in the array: " + max);
    }

    public static int findMax(int[] arr) {
        // Check if the array is empty
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Input array must not be empty or null");
        }

        // Initialize max variable with the first element
        int max = arr[0];

        // Traverse the array to find the maximum element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

}
