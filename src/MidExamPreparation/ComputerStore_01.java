package MidExamPreparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ComputerStore_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        List<Double> totalPrice = new ArrayList<>();
        while ((!input.equals("regular")) && (!input.equals("special"))){
            if (Double.parseDouble(input) <= 0){
                System.out.println("Invalid price!");
            } else {
                totalPrice.add(Double.parseDouble(input));
            }
            input = scanner.nextLine();
        }
        double total = 0;
        double sum = 0;
        double taxes = 0;
        double priceWithoutTaxes = 0;
        if (input.equals("special")){
            for (double item:totalPrice) {
                sum += item;
            }
            taxes = sum * 0.2;
            total = (taxes + sum) * 0.9;
            if (total <= 0 ){
                System.out.println("Invalid order!");
            } else if (total > 0){
                System.out.println("Congratulations you've just bought a new computer!");
                System.out.printf("Price without taxes: %.2f$\n", sum);
                System.out.printf("Taxes: %.2f$\n", taxes);
                System.out.println("-----------");
                System.out.printf("Total price: %.2f$", total);
            }
        } else if (input.equals("regular")){
            for (double item:totalPrice) {
                sum += item;
            }
            taxes = sum * 0.2;
            total = (taxes + sum);
            if (total <= 0 ){
                System.out.println("Invalid order!");
            } else if (total > 0){
                System.out.println("Congratulations you've just bought a new computer!");
                System.out.printf("Price without taxes: %.2f$\n", sum);
                System.out.printf("Taxes: %.2f$\n", taxes);
                System.out.println("-----------");
                System.out.printf("Total price: %.2f$", total);
            }
        }
    }
}
