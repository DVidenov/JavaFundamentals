package first_exercises;

import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int groupMembers = Integer.parseInt(scanner.nextLine());
        String groupType = scanner.nextLine();
        String dayOfTheWeek = scanner.nextLine();
        double price = 0;
        double percentage = 0;

        if (groupType.equals("Students")){
            if(dayOfTheWeek.equals("Friday")){
                price = 8.45 * groupMembers;
                if (groupMembers >= 30){
                    percentage = 0.15;
                    price = price - (price * percentage);
                }
            } else if(dayOfTheWeek.equals("Saturday")) {
                price = 9.80 * groupMembers;
                if (groupMembers >= 30){
                    percentage = 0.15;
                    price = price - (price * percentage);
                }
            } else if(dayOfTheWeek.equals("Sunday")) {
                price = 10.46 * groupMembers;
                if (groupMembers >= 30) {
                    percentage = 0.15;
                    price = price - (price * percentage);
                }
            }
        } else if (groupType.equals("Business")){
            if(dayOfTheWeek.equals("Friday")) {
                price = 10.90;
                if (groupMembers >= 100) {
                    price = ((groupMembers - 10) * price);
                } else {
                    price = (groupMembers * price);
                }
            } else if (dayOfTheWeek.equals("Saturday")){
                price = 15.60;
                if (groupMembers >= 100) {
                    price = ((groupMembers - 10) * price);
                } else {
                    price = (groupMembers * price);
                }
            } else if (dayOfTheWeek.equals("Sunday")) {
                price = 16;
                if (groupMembers >= 100) {
                    price = ((groupMembers - 10) * price);
                } else {
                    price = (groupMembers * price);
                }
            }
        } else if (groupType.equals("Regular")){
            if(dayOfTheWeek.equals("Friday")) {
                price = 15 * groupMembers;
                if (groupMembers >= 10 && groupMembers <= 20) {
                    percentage = 0.05;
                    price = (price - (price * percentage));
                }
            }else if(dayOfTheWeek.equals("Saturday")){
                price = 20 * groupMembers;
                if (groupMembers >= 10 && groupMembers <= 20) {
                    percentage = 0.05;
                    price = (price - (price * percentage));
                }
            } else if (dayOfTheWeek.equals("Sunday")){
                price = 22.50 * groupMembers;
                if (groupMembers >= 10 && groupMembers <= 20) {
                    percentage = 0.05;
                    price = (price - (price * percentage));
                }
            }
        }
        System.out.printf("Total price: %.2f", price);
    }
}
