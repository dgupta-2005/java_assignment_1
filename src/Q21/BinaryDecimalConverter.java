package Q21;

import java.util.Scanner;

public class BinaryDecimalConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter (1) to convert Binary to Decimal or (2) to convert Decimal to Binary:");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("Enter a binary number:");
            String binary = scanner.next();
            int decimal = Integer.parseInt(binary, 2);
            System.out.println("Decimal equivalent: " + decimal);
        } else if (choice == 2) {
            System.out.println("Enter a decimal number:");
            int decimal = scanner.nextInt();
            String binary = Integer.toBinaryString(decimal);
            System.out.println("Binary equivalent: " + binary);
        } else {
            System.out.println("Invalid choice");
        }

        scanner.close();
    }
}

