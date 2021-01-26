package ThirdExercises;

import java.util.Scanner;

public class WaterOverFlow_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int waterTankCapacity = 255;
        int inputs = Integer.parseInt(scanner.nextLine());

        double sumWater = 0;
        for (int i = 1; i <= inputs; i++) {
            int currentCapacity = Integer.parseInt(scanner.nextLine());
            sumWater += currentCapacity;
            if (sumWater > waterTankCapacity){
                sumWater -= currentCapacity;
                System.out.println("Insufficient capacity!");
            }
        }
        System.out.printf("%.0f", sumWater);
    }
}
