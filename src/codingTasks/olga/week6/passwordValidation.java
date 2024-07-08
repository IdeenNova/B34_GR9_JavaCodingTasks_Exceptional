package codingTasks.olga.week6;

public class passwordValidation {
    /*String -- Password Validation Task
1. Write a return method that can verify if a password is valid or not.
requirements:
 1. Password MUST be at least have 6 characters and should not contain space
2. PassWord should at least contain one upper case letter
3. PassWord should at least contain one lowercase letter
4. Password should at least contain one special characters
5. Password should at least contain a digit

if all requirements above are met, the method returns true, otherwise returns  false
*/

    public static void main(String[] args) {
        String password1 = "Password@123"; // Valid password
        String password2 = "pass@word";    // Invalid password
        String password3 = "p@asswo3rd";  // Invalid password

        System.out.println("Is password1 valid? " + isValidPassword(password1));
        System.out.println("Is password2 valid? " + isValidPassword(password2));
        System.out.println("isValidPassword(password3) = " + isValidPassword(password3));
    }

    public static boolean isValidPassword(String password) {
        // Check if password length is at least 6 characters and does not contain space
        if (password.length() < 6 || password.contains(" ")) {
            return false;
        }

        // Check for at least one uppercase letter, one lowercase letter, one special character, and one digit
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasSpecialChar = false;
        boolean hasDigit = false;

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(ch)) {
                hasLowerCase = true;
            } else if (isSpecialChar(ch)) {
                hasSpecialChar = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            }
        }

        // Check all conditions
        return hasUpperCase && hasLowerCase && hasSpecialChar && hasDigit;
    }

    private static boolean isSpecialChar(char ch) {
        // Define special characters as per the requirement
        String specialCharacters = "!@#$%^&*()-_=+\\|[{]};:'\",<.>/?";
        return specialCharacters.contains(String.valueOf(ch));
    }


}
