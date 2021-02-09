package first_exercises;

import java.util.Scanner;

public class unknown {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < 10; i++) {
            System.out.println(number);
        }
        while (number <= 10){
            System.out.println(number);
            number++;
        }
    }
}
