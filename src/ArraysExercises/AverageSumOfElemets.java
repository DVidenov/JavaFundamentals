package ArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class AverageSumOfElemets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numbers = Arrays.stream(scanner.nextLine().split(" "))
                        .mapToInt(e -> Integer.parseInt(e)).toArray();
        int sum = 0;
        int temp = 0;
        for (int number:numbers) {
            temp = number;
            sum += temp;
        }
        System.out.println(sum);
    }
}
