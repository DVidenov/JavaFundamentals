package ArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class TwosOfSum7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numbers = Arrays.stream(scanner.nextLine().split(" "))
                        .mapToInt(e -> Integer.parseInt(e)).toArray();

        int currentNumber = 0;
        for (int index = 0; index < numbers.length - 1; index++) {
            currentNumber = numbers[index];
            for (int number:numbers) {
                if (number + currentNumber == 7){
                    System.out.println(number + " " + currentNumber);
                }
            }
        }
    }
}
