package PR1.day4;
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
            ArrayList<String> arrayList = new ArrayList<String>();
            arrayList.add("Kim Dinh");
            arrayList.add("Kieu Anh");
            arrayList.add("Hien Nhi");

            System.out.println("ArrayList: " + arrayList);

            // Accessing elements
            System.out.println("First element: " + arrayList.get(0));

            // Removing element
            arrayList.remove(1);
            System.out.println("After removing second element: " + arrayList);
        }
    }


