package PR1.day2;

import java.util.Scanner;

public class act8 {
        public static void main(String[] args) {
            long totalMilliseconds = System.currentTimeMillis();
            long totalSeconds = totalMilliseconds / 1000;
            long currentSecond = totalSeconds % 60;
            long totalMinutes = totalSeconds / 60;
            long currentMinute = totalMinutes % 60;
            long totalHours = totalMinutes / 60;
            long currentHour = totalHours % 24;

            // Display the current time in GMT
            System.out.println("Current time in GMT: " + currentHour + ":" + currentMinute + ":" + currentSecond);




    }
}