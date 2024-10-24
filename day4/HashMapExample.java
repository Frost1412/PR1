package PR1.day4;
import java.util.HashMap;

public class HashMapExample {

        public static void main(String[] args) {
            HashMap<String, Integer> hashMap = new HashMap<>();
            hashMap.put("John", 30);
            hashMap.put("Alice", 25);
            hashMap.put("Bob", 20);


            System.out.println("HashMap: " + hashMap);

            // Accessing value by key
            System.out.println("John's age: " + hashMap.get("John"));

            // Removing a key-value pair
            hashMap.remove("Alice");
            System.out.println("After removing Alice: " + hashMap);
        }
    }


