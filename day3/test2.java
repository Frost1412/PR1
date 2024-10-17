package PR1.day3;
import java.util.Scanner;

public class test2 {



        public static void main(String[] args) {
            // Part a: 1 2 3 4 5 6 7 8 9 10
            int[] a = new int[10];
            for (int i = 0; i < a.length; i++) {
                a[i] = i + 1;
            }
            printArray("a", a);

            // Part b: 0 2 4 6 8 10 12 14 16 18 20
            int[] b = new int[11];
            for (int i = 0; i < b.length; i++) {
                b[i] = i * 2;
            }
            printArray("b", b);

            // Part c: 1 4 9 16 25 36 49 64 81 100
            int[] c = new int[10];
            for (int i = 0; i < c.length; i++) {
                c[i] = (i + 1) * (i + 1);
            }
            printArray("c", c);

            // Part d: 0 0 0 0 0 0 0 0 0
            int[] d = new int[9];
            for (int i = 0; i < d.length; i++) {
                d[i] = 0;
            }
            printArray("d", d);

            // Part e: 1 4 9 16 9 7 4 9 11
            int[] e = {1, 4, 9, 16, 9, 7, 4, 9, 11};
            printArray("e", e);

            // Part f: 0 1 0 1 0 1 0 1 0 1
            int[] f = new int[10];
            for (int i = 0; i < f.length; i++) {
                f[i] = i % 2;
            }
            printArray("f", f);

            // Part g: 0 1 2 3 4 0 1 2 3 4
            int[] g = new int[10];
            for (int i = 0; i < g.length; i++) {
                g[i] = i % 5;
            }
            printArray("g", g);
        }

        // Helper method to print arrays
        public static void printArray(String label, int[] array) {
            System.out.print(label + ": ");
            for (int num : array) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }


















