package ThirdExercises;

import java.util.Scanner;

public class SumOfChars_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int symbols = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        for (int i = 1; i <= symbols; i++) {
            char newSymbol = scanner.nextLine().charAt(0);
            sum += newSymbol;
        }
        System.out.println("The sum equals: " + sum);
    }
}
