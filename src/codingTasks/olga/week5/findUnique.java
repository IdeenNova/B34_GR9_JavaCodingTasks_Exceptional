package codingTasks.olga.week5;

public class findUnique {
    /*String -- Find the unique
    Write a return method that can find the unique characters from the String
    Ex: unique("AAABBBCCCDEF") ==> "DEF";*/

    public static void main(String[] args) {
        String input = "AAABBBCCCDEF";
        String result = unique(input);
        System.out.println("Unique characters: " + result);
    }

    public static String unique(String str) {
        StringBuilder uniqueChars = new StringBuilder();
        // Create an array to count occurrences of each character
        int[] charCount = new int[256]; // Assuming ASCII characters

        // Count occurrences of each character in the string
        for (int i = 0; i < str.length(); i++) {
            charCount[str.charAt(i)]++;
        }

        // Append characters to result which have count 1
        for (int i = 0; i < str.length(); i++) {
            if (charCount[str.charAt(i)] == 1) {
                uniqueChars.append(str.charAt(i));
            }
        }

        return uniqueChars.toString();
    }

}
