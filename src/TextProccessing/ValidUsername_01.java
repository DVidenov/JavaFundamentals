package TextProccessing;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ValidUsername_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] usernames = input.split(", ");

        for (String username : usernames) {
            if (isValidUsername(username)){
                System.out.println(username);
            }
        }
    }

    static boolean isValidUsername(String username) {
        if (username.length() < 3 || username.length() > 16) {
            return false;
        }
        for (int i = 0; i <= username.length() - 1; i++) {
            char currentSymbol = username.charAt(i);
            if (!Character.isLetterOrDigit(currentSymbol) && currentSymbol != '-' && currentSymbol != '_') {
                return false;
            }
        }
        return true;
    }
}