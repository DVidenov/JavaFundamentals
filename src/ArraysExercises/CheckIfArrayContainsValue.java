package ArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class CheckIfArrayContainsValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numbers = Arrays.stream(scanner.nextLine().split(" "))
                        .mapToInt(e -> Integer.parseInt(e)).toArray();
        int value = Integer.parseInt(scanner.nextLine());

        for (int number : numbers) {
            if (number == value){
                System.out.printf("Yes, %d is in the array.", value);
            }
        }
    }
}
