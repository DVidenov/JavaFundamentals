package MidExamPreparation;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.IntStream;

public class ArrayModifier_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String linesOfNumbers =scanner.nextLine();
        int[] intArray = parseArray(linesOfNumbers);
    }

    private static int[] parseArray(String linesOfNumbers) {
        String[] numbersAsStrings = linesOfNumbers.split(" ");
        int[] array = new int[linesOfNumbers.length()];

        for (int i = 0; i < linesOfNumbers.length(); i++) {
            array[i] = Integer.parseInt(numbersAsStrings[i]);
        }

        return array;
    }
}
