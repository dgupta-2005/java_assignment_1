package Q3;
import java.util.Scanner;

public class MaxOfThreeNumbers {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter three numbers:");
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            int num3 = scanner.nextInt();

            int max = Math.max(num1, Math.max(num2, num3));
            System.out.println("Maximum number is: " + max);

            scanner.close();
        }
    }


