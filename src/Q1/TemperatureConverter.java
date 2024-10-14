package Q1;
import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter temperature:");
        double temp = scanner.nextDouble();

        System.out.println("Convert to (1) Fahrenheit or (2) Celsius:");
        int choice = scanner.nextInt();

        if (choice == 1) {
            double fahrenheit = (temp * 9/5) + 32;
            System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        } else if (choice == 2) {
            double celsius = (temp - 32) * 5/9;
            System.out.println("Temperature in Celsius: " + celsius);
        } else {
            System.out.println("Invalid choice");
        }
        scanner.close();
    }
}


