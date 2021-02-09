package ThirdExercises;

import java.util.Scanner;

public class PokeMon_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int power = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int factor = Integer.parseInt(scanner.nextLine());
        int countPokedTargets = 0;
        double halfPower = power / 2.0;


        while (power >= distance) {
            power -= distance;
            countPokedTargets++;

            if (power == halfPower) {
                if (factor != 0){
                    power = power / factor;
                }
            }
        }
        System.out.println(power);
        System.out.println(countPokedTargets);
    }
}
