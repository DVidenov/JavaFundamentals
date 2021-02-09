package first_exercises;

import java.util.Scanner;

public class PrintAndSum_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        for (int i = firstNum; i <= secondNum; i++) {
            System.out.print(i + " ");
            sum += i;
        }
        System.out.println();
        System.out.println("Sum: " + sum);
    }
}
