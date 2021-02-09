package Methods;

import java.util.Scanner;

public class ComputeDigitsOfInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        SumTheDigits(number);
    }

    private static void SumTheDigits(int number) {
        int sum = 0;
        int currentDigit = 0;
        while (number !=0 ){
            currentDigit = number % 10;
            sum +=currentDigit;
            number /= 10;
        }
        System.out.println(sum);
    }
}
