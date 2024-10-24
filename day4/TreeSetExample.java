package PR1.day4;
import java.util.TreeSet;

public class TreeSetExample {

        public static void main(String[] args) {
            TreeSet<Integer> treeSet = new TreeSet<>();
            treeSet.add(20);
            treeSet.add(10);
            treeSet.add(30);
            treeSet.add(15);

            System.out.println("TreeSet: " + treeSet);

            // Checking first and last elements
            System.out.println("First element: " + treeSet.first());
            System.out.println("Last element: " + treeSet.last());
        }
    }



