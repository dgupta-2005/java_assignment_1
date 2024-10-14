package Q5;
import java.util.Scanner;

public class MilesToKilometers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter miles:");
        double miles = scanner.nextDouble();

        double kilometers = miles * 1.60934;
        System.out.println(miles + " miles = " + kilometers + " kilometers.");

        scanner.close();
    }
}
