package org.example.arrays;

import java.util.Scanner;

public class ConsecutiveCharacterCount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Get the count of consecutive repeating characters
        String result = getConsecutiveCharacterCount(input);

        // Print the result
        System.out.println("Consecutive repeating characters and their counts: ");
        System.out.println(result);

        scanner.close();
    }

    public static String getConsecutiveCharacterCount(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        char previousChar = s.charAt(0);
        int count = 1;

        for (int i = 1; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (currentChar == previousChar) {
                count++;
            } else {
                result.append(previousChar).append(count).append(" ");
                previousChar = currentChar;
                count = 1;
            }
        }
        // Append the last character and its count
        result.append(previousChar).append(count);

        return result.toString();
    }
}
