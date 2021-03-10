package TextProccessing;

import java.util.Scanner;

public class TextFilter03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] forbiddenWords = scanner.nextLine().split(", ");
        String input = scanner.nextLine();

        for (String forbiddenWord : forbiddenWords) {
            if (input.contains(forbiddenWord)){
                String wordOfStars = converWordToStars(forbiddenWord);
                input = input.replace(forbiddenWord, wordOfStars);
            }
        }
        System.out.println(input);
    }

    private static String converWordToStars(String word) {
        StringBuilder wordOfStars = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            wordOfStars.append("*");
        }
        return wordOfStars.toString();
    }
}
