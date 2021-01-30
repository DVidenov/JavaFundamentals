package ArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class CountRotation_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

        int countRotation = Integer.parseInt(scanner.nextLine());

        for (int rotation = 0; rotation < countRotation; rotation++) {
            int firstNumber = numbers[0];
            for (int index = 0; index < numbers.length - 1; index++) {
                numbers[index] = numbers[index + 1];
            }
            numbers[numbers.length - 1] = firstNumber;
        }
        for (int num: numbers) {
            System.out.print(num + " ");
        }
    }
}
