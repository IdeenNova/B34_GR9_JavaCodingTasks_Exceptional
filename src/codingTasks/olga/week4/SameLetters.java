package codingTasks.olga.week4;

import java.util.Arrays;

public class SameLetters {
    /*Write a return method that check if a string is build out of the same letters as another string.
    Ex:  same("abc",  "cab"); -> true
    same("abc",  "abb"); -> false:*/

    public static boolean same(String s1, String s2) {
        // Check if the lengths of the strings are equal
        if (s1.length() != s2.length()) {
            return false;
        }

        // Convert strings to character arrays
        char[] charArray1 = s1.toCharArray();
        char[] charArray2 = s2.toCharArray();

        // Sort character arrays
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare sorted character arrays
        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {

        String s1 = "abc";
        String s2 = "cab";
        System.out.println(same(s1, s2));  // Output: true

        String s3 = "abc";
        String s4 = "abb";
        System.out.println(same(s3, s4));  // Output: false

    }
}
