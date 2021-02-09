package ThirdExercises;

import java.util.Scanner;

public class IntegerOperations_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondtNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());
        int fourthNum = Integer.parseInt(scanner.nextLine());

        int firstPlusSecondSum = (firstNum + secondtNum) / thirdNum;
        int last = firstPlusSecondSum * fourthNum;
        System.out.println(last);
    }
}
