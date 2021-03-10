package TextProccessing;

import java.util.Scanner;
import java.util.concurrent.LinkedBlockingDeque;

public class RemoveSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String wordToRemove = scanner.nextLine();

        while (input.contains(wordToRemove)) {
            input = removeOccurrence(input, wordToRemove);
        }
        System.out.println(input);
    }

    private static String removeOccurrence(String input, String wordToRemove) {
        int beginIndex = input.indexOf(wordToRemove);
        int endIndex = beginIndex + wordToRemove.length();
        return input.substring(0, beginIndex) + input.substring(endIndex);
    }
}

