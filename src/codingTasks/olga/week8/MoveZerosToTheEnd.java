package codingTasks.olga.week8;

public class MoveZerosToTheEnd {
    /*Write a method that can move all the zeros to  last indexes of the array (Do Not Use Sort Method)
Ex:
input:  {1,0,2,0,3,0,4,0};
output: [1, 2, 3, 4, 0, 0, 0, 0]*/

    private int[] arr;

    // Constructor to initialize the array
    public MoveZerosToTheEnd(int[] arr) {
        this.arr = arr;
    }

    // Method to move all zeros to the end of the array
    public void moveZerosToEnd() {
        int nonZeroIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                // Swap the current non-zero element with the element at nonZeroIndex
                int temp = arr[nonZeroIndex];
                arr[nonZeroIndex] = arr[i];
                arr[i] = temp;
                // Move the nonZeroIndex pointer to the next position
                nonZeroIndex++;
            }
        }
    }

    // Method to get the current state of the array
    public int[] getArray() {
        return arr;
    }

    // Main method for testing
    public static void main(String[] args) {
        int[] inputArray = {1, 0, 2, 0, 3, 0, 4, 0};
        MoveZerosToTheEnd arrayManipulator = new MoveZerosToTheEnd(inputArray);
        arrayManipulator.moveZerosToEnd();
        int[] resultArray = arrayManipulator.getArray();

        // Print the result
        for (int num : resultArray) {
            System.out.print(num + " ");
        }
        // Output: 1 2 3 4 0 0 0 0
    }


}
