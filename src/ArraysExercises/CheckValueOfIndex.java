package ArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class CheckValueOfIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numbers = Arrays.stream(scanner.nextLine().split(" "))
                        .mapToInt(e -> Integer.parseInt(e)).toArray();

        int indexNum = Integer.parseInt(scanner.nextLine());

        for (int index = 0; index < numbers.length; index++) {
            if (index == indexNum - 1){
                System.out.println(numbers[index]);
            }
        }
    }
}
