

import java.util.Scanner;

public class Numberadd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input real and imaginary parts for both complex numbers in a more compact way
        System.out.print("Enter real and imaginary part of the first complex number (separated by space): ");
        double real1 = scanner.nextDouble();
        double imaginary1 = scanner.nextDouble();

        System.out.print("Enter real and imaginary part of the second complex number (separated by space): ");
        double real2 = scanner.nextDouble();
        double imaginary2 = scanner.nextDouble();

        // Perform the addition
        System.out.println("Sum of the complex numbers: " + (real1 + real2) + " + " + (imaginary1 + imaginary2) + "i");

        scanner.close();
    }
}


