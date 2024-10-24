package PR1.day4;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 0) {
            throw new Exception("Negative number entered");
        }
    }
}
