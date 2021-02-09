package Methods;

import java.util.Scanner;

public class MiddleCharacterOfString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        middleCharacterOfString(input);
    }

    private static void middleCharacterOfString(String input) {
        char character = input.charAt(input.length()/2);
        System.out.println(character);
    }
}
