package PR1.day3;
import java.util.Scanner;
public class act1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two characters: ");
        String a = sc.nextLine();
//       String  c =  a.toUpperCase();
//         char b = a.charAt(0);
        char b = Character.toUpperCase(a.charAt(0));
         char c = a.charAt(1);

         String major = " ";
         String student = " ";
         switch (b) {
             case 'M':
                 major = "Mathematics";
                 break;
             case 'C':
                 major = "Computer Science";
                break;
             case 'I':
                 major = "Information Technology";
                 break;
             default:
                 System.out.print("Chuyen nganh khong ton tai ");
                 break;

         }
         switch (c) {
             case '1':
                 student = "Freshman";
                 break;
             case '2':
                 student = "Sophomore";
             case '3':
                 student = "Junior";
             case '4':
                 student = "Senior";
                 break;
             default:
                 System.out.print("Hoc sinh khong ton tai ");
                 break;
         }
        System.out.println(major + " " + student);
         sc.close();
    }
}
