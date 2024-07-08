package codingTasks.olga.week6;

public class sumOfDigits {




        //Write a method that can return the sum of the digits in a string

    public static void main(String[] args) {
        String str1 = "abc123def456"; // Expected sum: 21 (1 + 2 + 3 + 4 + 5 + 6 = 21)
        String str2 = "a1b2c3";        // Expected sum: 6 (1 + 2 + 3 = 6)

        System.out.println("Sum of digits in str1: " + sumOfDigits(str1));
        System.out.println("Sum of digits in str2: " + sumOfDigits(str2));
    }

    public static int sumOfDigits(String str) {
        int sum = 0;

        // Iterate through each character in the string
        for (char ch : str.toCharArray()) {
            // Check if the character is a digit
            if (Character.isDigit(ch)) {
                // Convert the character to integer and add to sum
                sum += Character.getNumericValue(ch);
            }
        }

        return sum;
    }


}
