

import java.util.Scanner;

public class string{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        System.out.println("Length of the string: " + input.length()); 
        String upperCase = input.toUpperCase();
        System.out.println("String in uppercase: " + upperCase);
        String lowerCase = input.toLowerCase();
        System.out.println("String in lowercase: " + lowerCase);
        String reversed = new StringBuilder(input).reverse().toString();
        System.out.println("Reversed string: " + reversed);
        System.out.println("Enter a substring to search for:");
        String substring = scanner.nextLine();
        if (input.contains(substring)) {
            System.out.println("The string contains the substring: " + substring);
        } else {
            System.out.println("The string does not contain the substring: " + substring);
        } 
        String trimmedString = input.trim();
        System.out.println("Trimmed string: " + trimmedString);
        System.out.println("Enter the character or substring to replace:");
        String oldValue = scanner.nextLine();
        System.out.println("Enter the new character or substring:");
        String newValue = scanner.nextLine();
        String replacedString = input.replace(oldValue, newValue);
        System.out.println("String after replacement: " + replacedString); 
        System.out.println("Enter the prefix to check:");
        String prefix = scanner.nextLine();
        if (input.startsWith(prefix)) {
            System.out.println("The string starts with the prefix: " + prefix);
        } else {
            System.out.println("The string does not start with the prefix: " + prefix);
        }  
        System.out.println("Enter the suffix to check:");
        String suffix = scanner.nextLine();
        if (input.endsWith(suffix)) {
            System.out.println("The string ends with the suffix: " + suffix);
        } else {
            System.out.println("The string does not end with the suffix: " + suffix);
        }

        scanner.close();
    }
}

