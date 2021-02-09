package Methods;

import java.util.Scanner;

public class TopNumber_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < number; i++) {
            if(divisibleByEight(i) && containOddDigit(i)){
                System.out.println(i);
            }
        }
    }

    private static boolean divisibleByEight(int num) {
        int sum = 0;
        while (num > 0){
            sum += num % 10; //Намираме последната цифра на числото и я добавяме към сумата
            num /= 10; // Махаме последната цифра на числото
        }
        if (sum % 8 == 0){
            return true;
        } else {
            return false;
        }
    }

    private static boolean containOddDigit(int num) {
        int counter = 0;
        while (num > 0) {
            if ((num % 10) % 2 == 1){
                counter++; // проверявада дали има нечетно число и дали са 1 или повече.
            }
            num /= 10;
        }
        if (counter >= 1) { // ако counter = 1 или повече, значи имаме най-малко едно нечетно число.
            return true;
        }else {
            return false;
        }
    }
}
