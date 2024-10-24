package PR1.day4;
import java.util.InputMismatchException;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int a = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Day khong phai la so nguyen?");
            System.out.println("Nhap lai nhe ban: ");
            sc.nextLine();
            int a = sc.nextInt();
        }
    }

}
