package PR1.day4;
import java.util.Stack;

public class StackExample {

        public static void main(String[] args) {
            Stack<String> stack = new Stack<>();
            stack.push("First");
            stack.push("Second");
            stack.push("Third");

            System.out.println("Stack: " + stack);

            // Popping the top element
            System.out.println("Popped element: " + stack.pop());
            System.out.println("After popping: " + stack);
        }
    }


