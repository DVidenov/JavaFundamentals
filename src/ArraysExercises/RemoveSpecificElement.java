package ArraysExercises;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.Scanner;

public class RemoveSpecificElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numbers = Arrays.stream(scanner.nextLine().split(" "))
                        .mapToInt(e -> Integer.parseInt(e)).toArray();
        int num = Integer.parseInt(scanner.nextLine());

        for (int i = num; i < numbers.length -1; i++) {
            numbers[i] = 0;
        }
        int[] filteredArray = Arrays.stream(numbers).filter(e -> e != 0).toArray();
        System.out.println(Arrays.toString(filteredArray));
    }
}
