package PR1.day3;
import java.util.Arrays;

public class arraytest {

        public static int[] removeDuplicates(int[] array) {
            int n = array.length;
            if (n == 0 || n == 1) {
                return array; // If the array is empty or has one element, return as is
            }

            // Temporary array to store unique elements
            int[] temp = new int[n];
            int uniqueCount = 0;

            for (int i = 0; i < n; i++) {
                boolean isDuplicate = false;
                for (int j = 0; j < uniqueCount; j++) {
                    if (array[i] == temp[j]) {
                        isDuplicate = true; // Duplicate found
                        break;
                    }
                }
                if (!isDuplicate) {
                    temp[uniqueCount++] = array[i]; // Add unique element
                }
            }

            int[] resultArray = new int[uniqueCount];
            for (int i = 0; i < uniqueCount; i++) {
                resultArray[i] = temp[i];
            }

            return resultArray;
        }

        public static void main(String[] args) {
            int[] array = {1, 2, 2, 3, 4, 4, 5};
            int[] newArray = removeDuplicates(array);
            System.out.println("Array without duplicates: " + Arrays.toString(newArray));
        }
    }


