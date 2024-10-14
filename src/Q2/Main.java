package Q2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number: ");
        int n=sc.nextInt();
        PositiveNegativecheck p=new PositiveNegativecheck();
        p.checkSign(n);
    }
}
