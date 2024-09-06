package PR1.day2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class act2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter speed and accerletation please: " );
        double v = sc.nextDouble();
        double a = sc.nextDouble();
        double c = (v*v)/(2*a);
        System.out.println("The minimum runway length for this airplan is: " + c);

    }
}
