package SecondExercises;

import java.util.Scanner;

public class PoundsToDollars_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pounds = Double.parseDouble(scanner.nextLine());
        double dollars = pounds * 1.31;

        System.out.printf("%.3f", dollars);
    }
}