package PR1.day4;
import java.util.InputMismatchException;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        boolean gotIt = false;
//        Dung de check xem no co la so nguyen kh
        while (!gotIt) {
            try {
                System.out.print("Enter an integer: ");
                n = sc.nextInt();
                gotIt = true;
            } catch (Exception e) {
                System.err.print("Nah, don't try to fool me!");
                sc.nextLine(); // try commenting out this line
            }
        }
    }
}
