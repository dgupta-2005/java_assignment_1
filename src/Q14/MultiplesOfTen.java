package Q14;

import java.util.Scanner;

public class MultiplesOfTen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the start of the interval:");
        int start = scanner.nextInt();
        System.out.println("Enter the end of the interval:");
        int end = scanner.nextInt();

        System.out.println("Multiples of 10 between " + start + " and " + end + ":");
        for (int i = start; i <= end; i++) {
            if (i % 10 == 0) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}
