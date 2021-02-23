package MidExamPreparation;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstEmployee = Integer.parseInt(scanner.nextLine());
        int secondEmployee = Integer.parseInt(scanner.nextLine());
        int thirdEmployee = Integer.parseInt(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());

        int sumEmployees = firstEmployee + secondEmployee + thirdEmployee;
        double neededTime = Math.ceil(students * 1.0 / sumEmployees);
        double breaks = 0;
        if (neededTime >= 4){
            breaks =  Math.ceil(neededTime / 4);
        }
        for (int i = 0; i < breaks; i++) {
            neededTime += 1;
        }
        System.out.printf("Time needed: %.0fh.", neededTime);
    }
}
