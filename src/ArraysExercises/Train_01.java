package ArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int [] array = new int[n];

        for (int i = 0; i < n; i++) {
            array [i] = Integer.parseInt(scanner.nextLine());
        }
        int sum = 0;
        for (int number : array) {
            System.out.println(number + " ");
            sum += number;
        }
        System.out.println(sum);
        //System.out.println(Arrays.stream(array).max());
    }
}
