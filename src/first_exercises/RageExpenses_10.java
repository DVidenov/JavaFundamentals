package first_exercises;

import java.util.Scanner;

public class RageExpenses_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lostGames = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int countHeadset = lostGames / 2;
        double sumHeadset = countHeadset * headsetPrice;

        int countMouse = lostGames / 3;
        double sumMouse = countMouse * mousePrice;

        int countKeyboards = lostGames / 6;
        double sumKeyboards = countKeyboards * keyboardPrice;

        int countDisplays = lostGames / 12;
        double sumDisplays = countDisplays * displayPrice;

        double expenses = sumDisplays + sumKeyboards + sumMouse + sumHeadset;

        System.out.printf("Rage expenses: %.2f lv.", expenses);

    }
}
