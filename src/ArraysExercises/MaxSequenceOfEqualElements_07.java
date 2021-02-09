package ArraysExercises;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MaxSequenceOfEqualElements_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*int [] numbers = Arrays.stream(scanner.nextLine().split(" "))
                        .mapToInt(e -> Integer.parseInt(e)).toArray();

        int currentNum = 0;
        int count = 0;
        for (int index = 0; index < numbers.length - 1; index++) {
            currentNum = numbers[index];
            for (int i = index + 1; i < numbers.length - 1; i++) {
                if (numbers[i] == currentNum){
                    count ++;
                }
            }
            List<Integer> arraySequence = new ArrayList<>();
            if (count > 2){
                arraySequence.add(count);
            }
            System.out.println(arraySequence);
        }*/
        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int maxCount = 0;
        int digit = 0;
        int counter = 1;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == numbers[i - 1]) {
                counter++;

                if (counter > maxCount) {
                    maxCount = counter;
                    digit = numbers[i];
                }
            } else
                counter = 1;
        }

        for (int i = 0; i < maxCount; i++) {
            System.out.print(digit + " ");
        }
    }
}
