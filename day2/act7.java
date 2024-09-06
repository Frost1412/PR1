package PR1.day2;

import java.util.Scanner;

public class act7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so trong khaong tu 0 den 1000: " );
        int a = sc.nextInt();

        int so1 = a%10;
        a /= 10;
        int so2 = a%10;
        a /= 10;
        int so3 = a%10;
        a /= 10;
        int so4 = a%10;
        a /= 10;

        int tong = so1 + so2 + so3 + so4;
        System.out.println(tong);




    }
}
