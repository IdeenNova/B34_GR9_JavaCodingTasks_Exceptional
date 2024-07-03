package codingTasks.olga.week4;

import java.util.LinkedHashSet;

public class RemoveDuplicates {
     /*Write a return method that can remove the duplicated values from String
        Ex:  removeDup("AAABBBCCC")  ==> ABC*/

    public static String removeDup(String s) {
        // Use LinkedHashSet to maintain order and uniqueness of characters
        LinkedHashSet<Character> set = new LinkedHashSet<>();

        // Add each character from the string to the set
        for (char c : s.toCharArray()) {
            set.add(c);
        }

        // Build the result string from the set
        StringBuilder result = new StringBuilder();
        for (Character c : set) {
            result.append(c);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String inputStr = "AAABBBCCC";
        System.out.println(removeDup(inputStr)); // Output: ABC
    }
}
