package PR1.day4;
import java.util.LinkedList;

public class LinkedListExample {

        public static void main(String[] args) {
            LinkedList<String> linkedList = new LinkedList<>();
            linkedList.add("Dog");
            linkedList.add("Cat");
            linkedList.add("Dog");
            linkedList.add("Horse");

            System.out.println("LinkedList: " + linkedList);

            // Adding at the first position
            linkedList.addFirst("Elephant");
            // Removing the last element

            linkedList.removeLast();

            System.out.println("After modifications: " + linkedList);
        }
    }



