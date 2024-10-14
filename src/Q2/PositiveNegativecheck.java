package Q2;
import java.util.*;

public class PositiveNegativecheck {
  public  void checkSign(int num){
        if (num > 0) {
            System.out.println(num + " is positive.");

        } else if (num < 0) {
            System.out.println(num + " is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }
}
