package PR1.day3;
import java.util.Scanner;
public class act2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the month(First 3 letters with the first letter in upper case): ");
        String month = sc.nextLine();

        int day = 0;
        switch (month){
            case "Jan":
                day = 31;
                break;
            case "Mar":
                day = 31;
                break;
            case "May":
                day = 31;
                break;
            case "Jul":
                day = 31;
                break;
            case "Aug":
                day = 31;
                break;
            case "Oct":
                day = 31;
                break;
            case "Dec":
                day = 31;
                break;



            case "Apr":
                day = 30;
                break;
            case "Jun":
                day = 30;
                break;
            case "Sep":
                day = 30;
                break;
            case "Nov":
                day = 30;
                break;
//  Để xác định một năm có phải là năm nhuận trong lịch dương hay không, bạn có thể áp dụng các quy tắc sau đây:
//
//  Quy tắc cơ bản: Một năm sẽ được coi là năm nhuận nếu nó chia hết cho 4.
//  Quy tắc ngoại lệ 1: Nếu một năm chia hết cho 100, thì nó chỉ được coi là năm nhuận nếu nó cũng chia hết cho 400.


            case "Feb":
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    day = 29;
                } else {
                    day = 28;
                }
                break;
            default:
                System.out.println("Invalid month input.");


        }

            sc.close();
            System.out.println(month + " " + year + " has " + day + " days.");





    }
}
