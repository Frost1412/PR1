package PR1.day3;
import java.util.Scanner;

public class test2 {


        public static void main(String[] args) {
            // Example usage

            Scanner scanner = new Scanner(System.in);


            String input = scanner.nextLine();
            countVowelsAndConsonants(input);
        }

        // Method to count vowels and consonants
        public static void countVowelsAndConsonants(String str) {
            int vowelCount = 0;
            int consonantCount = 0;

            // Convert the string to lowercase to ignore case
            str = str.toLowerCase();

            // Loop through each character of the string
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);

                // Check if the character is a letter
                if (ch >= 'a' && ch <= 'z') {
                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                        vowelCount++;  // It's a vowel
                    } else {
                        consonantCount++;  // It's a consonant
                    }
                }
            }

            // Print the result
            System.out.println("Number of vowels: " + vowelCount);
            System.out.println("Number of consonants: " + consonantCount);
        }
    }
















