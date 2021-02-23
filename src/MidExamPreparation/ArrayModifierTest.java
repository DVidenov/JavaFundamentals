package MidExamPreparation;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.IntStream;

public class ArrayModifierTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();

        String input = scanner.nextLine();
        String command = input.split(" ")[0];
        int firstTempIndex ;
        int secondTempIndex;
        int firstTempDig;
        int secondTempDig;
        while (!command.equals("end")){
            switch (command){
                case "swap":
                    firstTempIndex = Integer.parseInt(input.split(" ")[1]);
                    secondTempIndex = Integer.parseInt(input.split(" ")[2]);
                    firstTempDig = numbers[firstTempIndex];
                    secondTempDig = numbers[secondTempIndex];
                    numbers[firstTempIndex] = secondTempDig;
                    numbers[secondTempIndex] = firstTempDig;
                    break;
                case "multiply":
                    firstTempIndex = Integer.parseInt(input.split(" ")[1]);
                    secondTempIndex = Integer.parseInt(input.split(" ")[2]);
                    firstTempDig = numbers[firstTempIndex];
                    secondTempDig = numbers[secondTempIndex];
                    int result = firstTempDig * secondTempDig;
                    numbers[firstTempIndex] = result;
                    break;
                case "decrease":
                    for (int i = 0; i < numbers.length; i++) {
                        numbers[i] = numbers[i] - 1;
                    }
                    break;
            }
            input = scanner.nextLine();
            command = input.split(" ")[0];
        }

        System.out.println(Arrays.toString(numbers).replaceAll("[\\[\\]]", ""));
    }
}
