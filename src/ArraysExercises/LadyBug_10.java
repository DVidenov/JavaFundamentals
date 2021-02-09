package ArraysExercises;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class LadyBug_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int [] arrayNumbers = new int [n];
        int [] numbers = Arrays.stream(scanner.nextLine().split(" "))
                        .mapToInt(e -> Integer.parseInt(e)).toArray();
        for (int i = 0; i < arrayNumbers.length ; i++) {
            for (int number: numbers) {
                if (arrayNumbers[i] == number){
                    arrayNumbers[i] = 1;
                }else {
                    arrayNumbers[i] = 0;
                }
            }
        }
        System.out.println(Arrays.toString(arrayNumbers));
    }
}
