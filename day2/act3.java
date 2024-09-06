package PR1.day2;

import java.util.Scanner;

public class act3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x1 and y1: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        System.out.print("Enter x2 and y2: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double c = (((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
        double dapan = Math.sqrt(c);
        System.out.println("The distance between the two points: " + dapan);

    }
}
