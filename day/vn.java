package PR1.day;

import java.util.Scanner;

public class vn {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String password = sc.nextLine();
//      String a = password.toLowerCase();
      String b = "abc123";
      if(password.equals(b)){
          System.out.println("Login successful");
      } else{
          System.out.println("Login failed");

      }



    }
}





