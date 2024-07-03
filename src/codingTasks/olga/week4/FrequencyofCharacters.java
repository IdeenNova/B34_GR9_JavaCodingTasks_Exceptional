package codingTasks.olga.week4;

public class FrequencyofCharacters {
    /*Write a return method that can find the frequency of characters
    Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2*/
    public static String frequencyOfChars(String s) {
        // Create a StringBuilder to build the result string
        StringBuilder result = new StringBuilder();

        // Create an array to store character frequencies (assuming ASCII characters)
        int[] charFreq = new int[256]; // ASCII has 256 characters

        // Count frequencies of each character in the string
        for (char c : s.toCharArray()) {
            charFreq[c]++;
        }

        // Build the result string from the character frequencies
        for (int i = 0; i < 256; i++) {
            if (charFreq[i] > 0) {
                result.append((char) i); // Append the character
                result.append(charFreq[i]); // Append its frequency
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String inputStr = "AAABBCDD";
        System.out.println(FrequencyofCharacters.frequencyOfChars(inputStr)); // Output: A3B2C1D2
    }


}
