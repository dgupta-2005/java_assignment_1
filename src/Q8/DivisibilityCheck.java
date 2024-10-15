package Q8;

import java.util.Scanner;

public class DivisibilityCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number:");
        int num2 = scanner.nextInt();

        if (num2 != 0 && num1 % num2 == 0) {
            System.out.println(num1 + " is divisible by " + num2);
        } else {
            System.out.println(num1 + " is not divisible by " + num2);
        }

        scanner.close();
    }
}

