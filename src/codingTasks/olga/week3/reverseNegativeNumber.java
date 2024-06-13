package codingTasks.olga.week3;

public class reverseNegativeNumber {
    //Write a return method that can reverse negative number and return it as int
    //ex: given int is ==> -53
    //  the output will be ==> -35

    public static int reverseNegative(int num) {
        if (num >= 0) {
            throw new IllegalArgumentException("Input must be a negative number");
        }
        // Convert the negative number to a string to easily reverse its digits
        String numString = Integer.toString(num);
        // Reverse the string excluding the '-' sign
        String reversedString = new StringBuilder(numString.substring(1)).reverse().toString();
        // Append the '-' sign to the reversed string and parse it back to an integer
        int reversedNum = Integer.parseInt("-" + reversedString);
        return reversedNum;
    }

    public static void main(String[] args) {
        int input = -64;
        int reversed = reverseNegative(input);
        System.out.println("Reversed number: " + reversed);
    }

}

