package Q12;

import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Admission A1=new Admission();
        Scanner sc=new Scanner(System.in);
        float physics,chemistry,maths;
        System.out.print("Physics marks: ");
        physics=sc.nextFloat();
        System.out.print("Chemistry marks: ");
        chemistry=sc.nextFloat();
        System.out.print("Maths marks: ");
        maths=sc.nextFloat();
        A1.setData(physics,chemistry,maths);
        A1.checkMarks();
    }
}
