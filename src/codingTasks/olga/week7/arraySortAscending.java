package codingTasks.olga.week7;

public class arraySortAscending {
    /*Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex: int[] arr = {10, 9, 8, 7};
arr = Sort(arr); ==>{ 7, 8, 9, 10};*/

    public static int[] Sort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return arr; // No need to sort if the array is null or has one or zero elements
        }

        // Bubble Sort algorithm
        int n = arr.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    // Swap arr[i] and arr[i + 1]
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }
            // Reduce the range of comparison as the largest element is in its correct position
            n--;
        } while (swapped); // Continue until no swaps are needed

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7};
        arr = Sort(arr);

        // Print sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

}
