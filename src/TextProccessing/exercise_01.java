package TextProccessing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercise_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split(" ");


        for (String word : words) {
            String repeatedWord = repeatWord(word, word.length());
            System.out.println(repeatedWord);
        }
    }

    private static String repeatWord(String word, int numberOfRepetitions) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numberOfRepetitions; i++) {
            result.append(word);
        }
        return result.toString();
    }
}
