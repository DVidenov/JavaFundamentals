package ListExercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        int[] arrayInput = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();

        for (int i = 0; i < numbers.size() - 1; i++) {
            int tempDig = numbers.get(i);
            if (tempDig == arrayInput[0]) {
                for (int j = 0; j <= arrayInput[1]; j++) {
                    numbers.set(i, 0);
                    if ((i + j) <= numbers.size()) {
                        numbers.set(i + j, 0);
                    } else {
                        break;
                    }
                }
                for (int k = 0; k <= arrayInput[1]; k++) {
                    numbers.set(i, 0);
                    if ((i - k) >= 0) {
                        numbers.set(i - k, 0);
                    } else {
                        break;
                    }
                }
                int sum = 0;
                for (int n : numbers) {
                    sum += n;
                }
                System.out.println(sum);
            }
        }
    }
}