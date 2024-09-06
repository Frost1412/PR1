package PR1.day2;

import java.util.Scanner;

public class act6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so tien cua ban vao: ");
        int tien = sc.nextInt();
        double tilelai = 0.05 / 12;
        double thang1 = tien * (1 + tilelai);
        double thang2 = (tien + thang1) * (1 + tilelai);
        double thang3 = (tien + thang2) * (1 + tilelai);
        double thang4 = (tien+ thang3) * (1 + tilelai);
        double thang5 = (tien + thang4) * (1 + tilelai);
        double thang6 = (tien + thang5) * (1 + tilelai);

        System.out.println("Tien co trong thang 6 la: " + thang6);

    }
}
