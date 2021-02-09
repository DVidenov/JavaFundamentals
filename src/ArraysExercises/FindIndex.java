package ArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class FindIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numbers = Arrays.stream(scanner.nextLine().split(" "))
                        .mapToInt(e -> Integer.parseInt(e)).toArray();
        int num = Integer.parseInt(scanner.nextLine());

        int count = 1;
        for (int number:numbers) {
            if (count == num){
                System.out.println(count + 1);
            }
            count++;
        }
    }
}
