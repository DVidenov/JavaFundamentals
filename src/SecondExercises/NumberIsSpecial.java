package SecondExercises;

import java.util.Enumeration;
import java.util.Scanner;

public class NumberIsSpecial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            int number = i;
            int sum = 0;
            while (number > 0){
                sum += number % 10;
                number = number / 10;
            }
            if (sum==5 || sum == 7 || sum == 11) {
                System.out.println(n + " -> True");
            }else {
                System.out.println(n + " -> False");
            }
        }
    }
}
