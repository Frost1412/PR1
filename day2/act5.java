package PR1.day2;
import java.util.Scanner;
public class act5 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter an amount: ");
            double amount = sc.nextDouble();
            int remainingCents = (int) Math.round(amount * 100);
            int dollars = remainingCents / 100;
            remainingCents = remainingCents % 100;
            int quarters = remainingCents / 25;
            remainingCents = remainingCents % 25;
            int dimes = remainingCents / 10;
            remainingCents = remainingCents % 10;
            int nickels = remainingCents / 5;
            remainingCents = remainingCents % 5;
            int pennies = remainingCents;
            System.out.println(" " + dollars + " dollars");
            System.out.println(" " + quarters + " quarters");
            System.out.println(" " + dimes + " dimes");
            System.out.println(" " + nickels + " nickels");
            System.out.println(" " + pennies + " pennies");
        }
    }


