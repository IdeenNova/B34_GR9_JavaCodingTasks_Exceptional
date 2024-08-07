package codingTasks.olga.week7;

public class arrayFindMinimum {
    // Write a method that can find the minimum  number from an int Array


    public static void main(String[] args) {
        int[] numbers = {5, 3, 9, 1, 7};

        int[] num = {2,5,9,20};
        System.out.println("findMinimum(num) = " + findMinimum(num));
        int min = findMinimum(numbers);
        System.out.println("Minimum number: " + min);
    }

    public static int findMinimum(int[] array) {
        // Check if the array is empty
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }

        // Initialize min with the first element of the array
        int min = array[0];

        // Iterate through the array starting from the second element
        for (int i = 1; i < array.length; i++) {
            // If current element is smaller than min, update min
            if (array[i] < min) {
                min = array[i];
            }
        }

        return min;
    }
}
