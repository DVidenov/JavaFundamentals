package ObjectsAndClasses;

import java.util.Scanner;

public class SumBigNumbersMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long first = Long.parseLong(scanner.nextLine());
        long second = Long.parseLong(scanner.nextLine());

        SumBigNumbers result = new SumBigNumbers();
        result.setFirstDig(first);
        result.setSecondDig(second);
        System.out.println(result.getResult());
    }
}
