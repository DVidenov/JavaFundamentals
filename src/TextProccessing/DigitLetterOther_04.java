package TextProccessing;

import java.util.Scanner;

public class DigitLetterOther_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        StringBuilder digit = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder symbols = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char currentSymbol = input.charAt(i);
            if (Character.isDigit(currentSymbol)){
                digit.append(currentSymbol);
            } else if (Character.isAlphabetic(currentSymbol)){
                letters.append(currentSymbol);
            } else{
                symbols.append(currentSymbol);
            }
        }
        System.out.println(digit.toString());
        System.out.println(letters.toString());
        System.out.println(symbols.toString());
    }
}
