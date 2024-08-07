package codingTasks.olga.week7;

public class arraySortDescending {
  /*Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
Ex: int[] arr = {10,20,7, 8, 90};
arr = Sort(arr); ==> {90, 20, 10, 8, 7};*/

    // Method to sort an int array in descending order using Bubble Sort
    public static int[] Sort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return arr; // No need to sort if the array is null or has one or zero elements
        }

        // Bubble Sort algorithm modified for descending order
        int n = arr.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] < arr[i + 1]) {
                    // Swap arr[i] and arr[i + 1]
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }
            // Reduce the range of comparison as the smallest elements are in their correct positions
            n--;
        } while (swapped); // Continue until no swaps are needed

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 7, 8, 90};
        arr = Sort(arr);

        // Print sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

}
