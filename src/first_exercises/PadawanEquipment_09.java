package first_exercises;

import java.util.Scanner;

public class PadawanEquipment_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Inputs
        double amountOfMoney = Double.parseDouble(scanner.nextLine());
        int studentsNumber = Integer.parseInt(scanner.nextLine());
        double lightSabrePrice = Double.parseDouble(scanner.nextLine());
        double priceOfRobes = Double.parseDouble(scanner.nextLine());
        double priceOfBelts = Double.parseDouble(scanner.nextLine());
        int totalBelts = studentsNumber;

        //Totals
        double totalPriceOfRobes = priceOfRobes * studentsNumber;
        if (studentsNumber > 6){
            totalBelts = totalBelts - (studentsNumber / 6);
        }
        double totalBeltsPrice = totalBelts * priceOfBelts;
        double totalLightSabres = (studentsNumber + Math.ceil(studentsNumber * 0.1));
        double totalLightSabresPrice = (totalLightSabres * lightSabrePrice);
        double totalPrice = totalBeltsPrice + totalLightSabresPrice + totalPriceOfRobes;

        if (amountOfMoney >= totalPrice){
            System.out.printf("The money is enough - it would cost %.2flv.", totalPrice);
        }else if (amountOfMoney < totalPrice){
            totalPrice = totalPrice - amountOfMoney;
            System.out.printf("Ivan Cho will need %.2flv more.", totalPrice);
        }


    }
}
