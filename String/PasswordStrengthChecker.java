package String;

import java.util.Scanner;

public class PasswordStrengthChecker {

    // Method to check password strength
    public static boolean isStrongPassword(String password) {
        if (password.length() < 14 || password.contains(" ")) {
            return false; // Check for minimum length and no spaces
        }

        int upperCaseCount = 0;
        int lowerCaseCount = 0;
        int digitCount = 0;
        int specialCharCount = 0;

        // Check character counts
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                upperCaseCount++;
            } else if (Character.isLowerCase(c)) {
                lowerCaseCount++;
            } else if (Character.isDigit(c)) {
                digitCount++;
            } else if (isSpecialCharacter(c)) {
                specialCharCount++;
            }
        }

        return upperCaseCount >= 4 && lowerCaseCount >= 4 && digitCount >= 4 && specialCharCount >= 2;
    }

    // Helper method to check if a character is a special character
    private static boolean isSpecialCharacter(char c) {
        // Define a set of special characters
        String specialCharacters = "!@#$%^&*()-_=+[]{}|;:',.<>?/`~";
        return specialCharacters.contains(String.valueOf(c));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the password to check its strength:");
        String password = sc.nextLine();

        if (isStrongPassword(password)) {
            System.out.println("The password is strong.");
        } else {
            System.out.println("The password is not strong.");
        }

        sc.close();
    }
}
