package PR1.day3;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();
       if (b == 0) {
           throw new ArithmeticException("Sua lai so di ban");
       }
        System.out.println(a/b);

    }

    }



















