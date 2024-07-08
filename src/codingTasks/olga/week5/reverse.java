package codingTasks.olga.week5;

public class reverse {
   /* Write a return method that can reverse  String
    Ex: Reverse("ABCD"); ==> DCBA*/

    public static void main(String[] args) {
        String input = "ABCD";
        String reversed = reverse(input);
        System.out.println("Reversed string: " + reversed);
    }

    public static String reverse(String str) {
        // Convert the string to a char array
        char[] charArray = str.toCharArray();

        // Initialize pointers for reversing
        int left = 0;
        int right = charArray.length - 1;

        // Reverse the char array
        while (left < right) {
            // Swap characters at left and right pointers
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            // Move pointers towards the center
            left++;
            right--;
        }

        // Convert char array back to string
        return new String(charArray);
    }
}
