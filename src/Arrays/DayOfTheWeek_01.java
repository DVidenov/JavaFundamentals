package Arrays;

import java.lang.reflect.Array;
import java.util.Scanner;

public class DayOfTheWeek_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] daysOfWeek = {
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"
        };
        int currentDay = Integer.parseInt(scanner.nextLine());
        if (currentDay > 0 && currentDay <= 7){
            System.out.println(daysOfWeek[currentDay -1]);
        } else {
            System.out.println("Invalid day!");
        }
    }
}
