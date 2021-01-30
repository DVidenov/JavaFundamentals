package ArraysExercises;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class EqualSums_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();
        boolean isFound = false;

        for (int index = 0; index <= numbers.length - 1; index++) {
            int sumLeft = 0;
            int sumRight = 0;

            for (int indexleft = 0; indexleft <= index - 1; indexleft++) {
                sumLeft += numbers[indexleft];
            }

            for (int indexRight = index + 1; indexRight <= numbers.length - 1 ; indexRight++) {
                sumRight += numbers[indexRight];
            }
            if (sumLeft==sumRight){
                isFound = true;
                System.out.println(index);
            }
        }
        if (!isFound){
            System.out.println("no");
        }
    }
}
