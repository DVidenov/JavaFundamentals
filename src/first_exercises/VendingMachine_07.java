package first_exercises;

import java.util.Scanner;

public class VendingMachine_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double Nuts = 2.0;
        double Water = 0.7;
        double Crisps = 1.5;
        double Soda = 0.8;
        double Coke = 1.0;
        double insertedMoney = 0;
        double totalMoney = 0;

        String moneyInsert = scanner.nextLine();
        while (!moneyInsert.equals("Start")) {
            insertedMoney = (Double.parseDouble(moneyInsert));
            if (insertedMoney == 2){
                totalMoney += insertedMoney;
            } else if (insertedMoney == 1){
                totalMoney += insertedMoney;
            } else if (insertedMoney == 0.5){
                totalMoney += insertedMoney;
            } else if (insertedMoney == 0.2){
                totalMoney += insertedMoney;
            } else if (insertedMoney == 0.1){
                totalMoney += insertedMoney;
            } else {
                System.out.printf("Cannot accept %.2f", insertedMoney);
                System.out.println();
            }
            moneyInsert = scanner.nextLine();
        }
        String command = scanner.nextLine();
        while (!command.equals("End")){
            if (command.equals("Nuts")){
                if (totalMoney >= 2){
                    totalMoney = totalMoney - Nuts;
                    System.out.println("Purchased Nuts");
                    command = scanner.nextLine();
                }else {
                    System.out.println("Sorry, not enough money");
                    command = scanner.nextLine();
                }
            } else if (command.equals("Water")){
                if (totalMoney >= 0.7){
                    totalMoney = totalMoney - Water;
                    System.out.println("Purchased Water");
                    command = scanner.nextLine();
                }else {
                    System.out.println("Sorry, not enough money");
                    command = scanner.nextLine();
                }
            } else if (command.equals("Crisps")){
                if (totalMoney >= 1.5){
                    totalMoney = totalMoney - Crisps;
                    System.out.println("Purchased Crisps");
                    command = scanner.nextLine();
                }else {
                    System.out.println("Sorry, not enough money");
                    command = scanner.nextLine();
                }
            } else if (command.equals("Soda")){
                if (totalMoney >= 0.8){
                    totalMoney = totalMoney - Soda;
                    System.out.println("Purchased Soda");
                    command = scanner.nextLine();
                }else {
                    System.out.println("Sorry, not enough money");
                    command = scanner.nextLine();
                }
            } else if (command.equals("Coke")){
                if (totalMoney >= 1){
                    totalMoney = totalMoney - Coke;
                    System.out.println("Purchased Coke");
                    command = scanner.nextLine();
                }else {
                    System.out.println("Sorry, not enough money");
                    command = scanner.nextLine();
                }
            } else {
                System.out.println("Invalid product");
                command = scanner.nextLine();
            }
        } System.out.printf("Change: %.2f", totalMoney);
    }
}